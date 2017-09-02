package com.zyka.spring.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
public class Hobby {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private double cost;

    public Hobby(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}
