package com.zyka.spring.test.repositories;

import com.zyka.spring.test.model.Animal;
import com.zyka.spring.test.model.projections.AnimalProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = AnimalProjection.class)
public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
