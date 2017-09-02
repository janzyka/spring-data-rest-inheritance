package com.zyka.spring.test.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
public class Person {

    @Id
    private long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Animal> animals;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Hobby> hobbies;

    public Person(String name, List<Animal> animals, List<Hobby> hobbies) {
        this.animals = animals;
        this.hobbies = hobbies;
        this.name = name;
    }
}
