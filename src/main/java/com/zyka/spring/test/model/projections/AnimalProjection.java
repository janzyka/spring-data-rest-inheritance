package com.zyka.spring.test.model.projections;

import com.zyka.spring.test.model.Animal;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "animalNameOnly", types = {Animal.class})
public interface AnimalProjection {
    String getName();
}
