package com.example.demo.service.impl;



import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.demo.service.OpenApiService;

@Service
public class OpenApiServiceImplementation implements OpenApiService {
    
   @Override
    public String getCall() {
        //StringBuilder response = new StringBuilder();
       /* try {
            URL url = new URL("https://api.restful-api.dev/objects");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String output;
                while ((output = br.readLine()) != null) {
                    response.append(output);
                }
            }
            conn.disconnect();
        } catch (IOException e) {
            throw new RuntimeException("Error calling API", e);
        }
        return response.toString();*/

        WebClient webClient = WebClient.create();
        String  rsp = webClient.get()
                .uri("https://api.restful-api.dev/objects")
                .retrieve()
                .bodyToMono(String.class)
                .block();
                return rsp;

    }

}
