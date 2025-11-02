package com.example.appservice.controller;

import com.example.appservice.model.CombinedResponse;
import com.example.appservice.service.FetchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class FetchController {

	@Autowired
    private FetchService fetchService;

    @GetMapping("/fetchData")
    public CompletableFuture<CombinedResponse> fetchData() {
        return fetchService.fetchCombinedData();
    }
}
