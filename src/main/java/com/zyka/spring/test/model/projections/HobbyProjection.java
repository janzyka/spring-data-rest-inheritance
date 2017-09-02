package com.zyka.spring.test.model.projections;

import com.zyka.spring.test.model.Hobby;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "hobbyNameOnly", types = Hobby.class)
public interface HobbyProjection {
    String getName();
}
