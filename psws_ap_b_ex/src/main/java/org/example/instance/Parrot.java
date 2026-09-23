package org.example.instance;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @PostConstruct
    public void init(){
        this.name="kiki";
        System.out.println("hello");
    }

}
