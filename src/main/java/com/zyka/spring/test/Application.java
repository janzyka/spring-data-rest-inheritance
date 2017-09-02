package com.zyka.spring.test;

import static java.util.Collections.singletonList;

import com.zyka.spring.test.model.Cat;
import com.zyka.spring.test.model.Dog;
import com.zyka.spring.test.model.Hobby;
import com.zyka.spring.test.model.Person;
import com.zyka.spring.test.repositories.PersonRepository;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner initData(final PersonRepository personRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                Person person = new Person("Moi", Arrays.asList(new Cat("Meaow", "tutu"), new Dog("WafWaf", "lala")), singletonList(new Hobby("Run", 100.0)));
                personRepository.save(person);
            }
        };
    }
}
