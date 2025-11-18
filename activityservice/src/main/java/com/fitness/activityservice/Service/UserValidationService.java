package com.fitness.activityservice.Service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;

@Service
@AllArgsConstructor
public class UserValidationService {
    private final WebClient userServiceWebClient;

    public boolean validateUser(String userId) {

        try{
            return userServiceWebClient.get()
                    .uri("http://localhost:8080/api/users/{user_Id}/validate",userId)
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    .block();
        } catch (WebClientException ex){
            ex.printStackTrace();
        }
        return false;
    }
}
