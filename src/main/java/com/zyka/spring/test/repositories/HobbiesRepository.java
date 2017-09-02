package com.zyka.spring.test.repositories;

import com.zyka.spring.test.model.Hobby;
import com.zyka.spring.test.model.Person;
import com.zyka.spring.test.model.projections.HobbyProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = HobbyProjection.class)
public interface HobbiesRepository extends CrudRepository<Hobby, Long> {

}
