package org.example;

import org.example.config.ProjectConfig;
import org.example.instance.Parrot;
import org.example.instance.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
//        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(person.getName());
//        System.out.println(parrot);
        System.out.println(person.getParrot());
//        System.out.println(context.getBean("person1",Person.class));
    }
}