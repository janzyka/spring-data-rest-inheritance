package com.zyka.spring.test.model;

import javax.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
public class Cat extends Animal {

    private String catSpecialThing;

    public Cat(String name, String catSpecialThing) {
        super(name);
        this.catSpecialThing = catSpecialThing;
    }

    @Override
    public Type getType() {
        return Type.CAT;
    }
}
