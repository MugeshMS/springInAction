package org.example.instance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }
//    @Autowired
//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }      set using setter


    private String name;

    public Person(@Qualifier("parrot2") Parrot parrot)
    {
        this.parrot = parrot;
    }

    private Parrot parrot;

}
