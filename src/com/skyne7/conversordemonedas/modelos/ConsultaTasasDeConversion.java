package com.skyne7.conversordemonedas.modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTasasDeConversion {

    public TasasExchangeRate tipo(String moneda) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/77f7beca3f00cb47828deb7e/latest/"+moneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TasasExchangeRate.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre la moneda que necesitas convertir.");
        }
    }
}
