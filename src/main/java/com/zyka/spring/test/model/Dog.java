package com.zyka.spring.test.model;

import javax.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
public class Dog extends Animal {

    private String dogSpecialThing;

    public Dog(String name, String dogSpecialThing) {
        super(name);
        this.dogSpecialThing = dogSpecialThing;
    }

    @Override
    public Type getType() {
        return Type.DOG;
    }
}
