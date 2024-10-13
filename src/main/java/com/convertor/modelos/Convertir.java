package com.convertor.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Convertir {
    private final String key = "ef4c500df42ab677f9e931a1";
    private final String apiUrl = "https://v6.exchangerate-api.com/v6/"+key;
    private final String apiCon = apiUrl+"/pair/";
    private final HttpClient cliente = HttpClient.newHttpClient();
    private final Gson gson = new Gson();
    private float valorPeso = 0.0f;
    private float valorEuro = 0.0f;

    public Convertir(){
    }

    public float dolarToPesoCop(float monto){
        float resultado = 0.0f;
        try{
            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(apiCon+"/USD/COP")).build();
            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
            Respuesta respuesta = gson.fromJson(response.body(), Respuesta.class);
            valorPeso = respuesta.getConversion_rate();

            resultado = monto * valorPeso;

            return resultado;
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public float pesoCopToDolar(float monto){
        float resultado = 0.0f;
        try {
            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(apiCon+"USD/COP")).build();
            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
            Respuesta respuesta = gson.fromJson(response.body(), Respuesta.class);
            valorPeso = respuesta.getConversion_rate();

            resultado = monto / valorPeso;

            return resultado;
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public float euroToPesoCop(float monto){
        float resultado = 0.0f;
        try {
            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(apiCon+"EUR/COP")).build();
            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
            Respuesta respuesta = gson.fromJson(response.body(), Respuesta.class);
            valorPeso = respuesta.getConversion_rate();

            resultado = monto * valorPeso;

            return resultado;
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public float pesoCopToEuro(float monto){
        float resultado = 0.0f;
        try {
            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(apiCon+"EUR/COP")).build();
            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
            Respuesta respuesta = gson.fromJson(response.body(), Respuesta.class);
            valorPeso = respuesta.getConversion_rate();

            resultado = monto / valorPeso;
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public float dolarToEuro(float monto){
        float resultado = 0.0f;
        try {
            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(apiCon+"USD/EUR")).build();
            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
            Respuesta respuesta = gson.fromJson(response.body(), Respuesta.class);
            valorEuro = respuesta.getConversion_rate();

            resultado = monto * valorEuro;

            return resultado;

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public float euroToDolar(float monto){
        float resultado = 0.0f;
        try {
            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(apiCon+"USD/EUR")).build();
            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
            Respuesta respuesta = gson.fromJson(response.body(), Respuesta.class);
            valorEuro = respuesta.getConversion_rate();

            resultado = monto / valorEuro;

            return resultado;
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
}
