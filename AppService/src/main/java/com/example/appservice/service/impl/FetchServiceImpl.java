package com.example.appservice.service.impl;

import com.example.appservice.model.CombinedResponse;
import com.example.appservice.model.Order;
import com.example.appservice.model.User;
import com.example.appservice.service.FetchService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class FetchServiceImpl implements FetchService {

    private final WebClient webClient;
    private final String userServiceUrl;
    private final String orderServiceUrl;

    public FetchServiceImpl(
            @Value("${user.service.url}") String userServiceUrl,
            @Value("${order.service.url}") String orderServiceUrl
    ) {
        this.webClient = WebClient.create();
        this.userServiceUrl = userServiceUrl;
        this.orderServiceUrl = orderServiceUrl;
    }

    @Async("taskExecutor")
    public CompletableFuture<List<User>> fetchUsers() {
        Mono<List<User>> response = webClient.get()
                .uri(userServiceUrl)
                .retrieve()
                .bodyToFlux(User.class)
                .collectList();
        return response.toFuture();
    }

    @Async("taskExecutor")
    public CompletableFuture<List<Order>> fetchOrders() {
        Mono<List<Order>> response = webClient.get()
                .uri(orderServiceUrl)
                .retrieve()
                .bodyToFlux(Order.class)
                .collectList();
        return response.toFuture();
    }

    @Override
    public CompletableFuture<CombinedResponse> fetchCombinedData() {
        CompletableFuture<List<User>> usersFuture = fetchUsers();
        CompletableFuture<List<Order>> ordersFuture = fetchOrders();

        return CompletableFuture.allOf(usersFuture, ordersFuture)
                .thenApply(v -> new CombinedResponse(
                        usersFuture.join(),
                        ordersFuture.join()
                ));
    }
}
