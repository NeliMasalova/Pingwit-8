package pl.pingwit.lec_19.task_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pingwit.lec_19.task_2.Atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class SearchATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your city or town:");
        String city = scanner.nextLine();
        String urlTemplate = "https://belarusbank.by/api/atm?city=%s";
        String request = String.format(urlTemplate, city);

        try {
            String jsonResponse = sendHttpGetRequest(request);
            if (jsonResponse == null && jsonResponse.equals("null")) {
                Atm[] atms = parseJsonResponse(jsonResponse);

                for (Atm obj : atms) {
                    System.out.println(obj);
                }
            } else {
                System.out.println("Sorry, your city's name is invalid.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String sendHttpGetRequest(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                return response.toString();
            }
        } else {
            throw new IOException("HTTP GET request failed with response code: " + responseCode);
        }
    }

    private static Atm[] parseJsonResponse(String jsonResponse) throws IOException {
        return new ObjectMapper()
                .readValue(jsonResponse, Atm[].class);
    }
}