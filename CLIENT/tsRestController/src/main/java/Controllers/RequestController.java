package Controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class RequestController {
    public static String get(String URL){
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject(URL, String.class);
        return response;
    }

    public static String get(String URL, String index){
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject(URL + "/" + index, String.class);
        return response;
    }

    public static String post(String URL, String json){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/json");

        HttpEntity<String> httpEntity = new HttpEntity <String> (json, httpHeaders);

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.postForObject(URL, httpEntity, String.class);

        return response;
    }

    public static String put(String URL, String json){
        return post(URL, json);
    }

    public static void delete(String URL){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(URL);
    }

    public static void delete(String URL, String index){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(URL + "/" + index);
    }
}
