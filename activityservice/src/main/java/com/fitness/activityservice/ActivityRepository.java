package com.fitness.activityservice;

import com.fitness.activityservice.Models.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActivityRepository extends MongoRepository<Activity, String> {
}
