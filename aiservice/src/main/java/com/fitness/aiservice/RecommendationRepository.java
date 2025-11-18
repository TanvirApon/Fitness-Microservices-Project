package com.fitness.aiservice;

import com.fitness.aiservice.Models.Recommendation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.*;

public interface RecommendationRepository extends MongoRepository<Recommendation,String> {
    List<Recommendation> findUserById(String userId);

    Optional<Recommendation> findActivityById(String activityId);
}
