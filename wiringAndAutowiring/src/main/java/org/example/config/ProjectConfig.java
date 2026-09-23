package org.example.config;

import org.example.instance.Parrot;
import org.example.instance.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
//    @Bean
//    public Parrot parrot(){
//        Parrot parrot = new Parrot();
//        parrot.setName("pune");
//        return parrot;
//    }
//    @Bean
//    @Primary
//    public Person person(){
//        Person person = new Person();
//        person.setName("Mugesh");
//        person.setParrot(parrot()); /// wiring by calling the method
//        return person;
//    }
////
//    @Bean
//    public Person person1(Parrot parrot){ // we areinstructing spring to provide bean from its context
//        Person person = new Person();
//        person.setName("Mugesh M S");
//        person.setParrot(parrot);
//        return person;
//    }
}
