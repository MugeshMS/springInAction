package org.example.instance;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    @Override
//    public String toString(){
//        return "Parrot : "+name;
//    }

    private String name;

}

