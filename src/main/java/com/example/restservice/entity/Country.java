package com.example.restservice.entity;

import lombok.Data;

@Data
public class Country {

    private static String EUR = "EUR";

    private String name;
    private String capital;
    private String currency;
    private int population;
}
