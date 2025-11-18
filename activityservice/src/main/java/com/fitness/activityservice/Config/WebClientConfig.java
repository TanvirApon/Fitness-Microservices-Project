package com.fitness.activityservice.Config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import java.beans.JavaBean;

@Configuration
public class WebClientConfig  {

    @Bean
    @LoadBalanced
    public WebClient.Builder WebClientBuilder(){
        return WebClient.builder();
    }

    @Bean
    public WebClient userSeriveWebClient(WebClient.Builder webClientbuilder) {
        return webClientbuilder.baseUrl("http://USERSERVICE").build();
    }
}
