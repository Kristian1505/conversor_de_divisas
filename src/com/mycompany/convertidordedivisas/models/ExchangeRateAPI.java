package com.mycompany.convertidordedivisas.models;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateAPI {

    public double getExchangeRate(UserInput userInput) throws IOException, InterruptedException {

        // Create an HTTP client
        HttpClient client = HttpClient.newHttpClient();

        String URL = "https://v6.exchangerate-api.com/v6/bf0b4d167a7a43957493ef42/latest/" + userInput.getSourceCurrency();


        // Create an HTTP request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();

        // Send the request and get the response
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        ExchangeRateResponse exchangeRateResponse = gson.fromJson(json, ExchangeRateResponse.class);

        switch (userInput.getTargetCurrency()) {
            case "ARS":
                return exchangeRateResponse.getConversion_rates().getARS();
            case "BOB":
                return exchangeRateResponse.getConversion_rates().getBOB();
            case "CLP":
                return exchangeRateResponse.getConversion_rates().getCLP();
            case "MXN":
                return exchangeRateResponse.getConversion_rates().getMXN();
            case "USD":
                return exchangeRateResponse.getConversion_rates().getUSD();
            default:
                throw new IllegalArgumentException("Invalid target currency.");
        }

    }




}



