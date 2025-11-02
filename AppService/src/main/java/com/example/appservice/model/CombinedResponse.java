package com.example.appservice.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CombinedResponse {
    private List<User> users;
    private List<Order> orders;

    public CombinedResponse(List<User> users, List<Order> orders) {
        this.users = users;
        this.orders = orders;
    }

}
