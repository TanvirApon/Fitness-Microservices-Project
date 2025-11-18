package com.fitness.aiservice.Service;


import com.fitness.aiservice.RecommendationRepository;
import com.fitness.aiservice.Models.Recommendation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RecommendationService {

    private final RecommendationRepository recommendationRepository;

    public List<Recommendation> getUserRecommendation(String userId){
        return recommendationRepository.findUserById(userId);
    }

    public Recommendation getActivityRecommendation(String activityId) {

        return recommendationRepository.findActivityById(activityId)
                .orElseThrow(()->new RuntimeException("No Recommendation Found for this Activity"+activityId));
    }
}
