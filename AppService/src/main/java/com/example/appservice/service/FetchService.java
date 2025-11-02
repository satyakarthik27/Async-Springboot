package com.example.appservice.service;

import com.example.appservice.model.CombinedResponse;
import java.util.concurrent.CompletableFuture;

public interface FetchService {
    CompletableFuture<CombinedResponse> fetchCombinedData();
}
