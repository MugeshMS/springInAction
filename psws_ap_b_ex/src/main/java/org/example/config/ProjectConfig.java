package org.example.config;

import org.example.instance.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
@Bean
@Primary
    public Parrot parrot(){
    Parrot p = new Parrot();
    p.setName("Parrot");
    return p;
}
@Bean
    public Parrot parrot1(){
    return new Parrot();
}

@Bean(name="name")
    public Parrot parrot2(){
    Parrot p = new Parrot();
    p.setName("name");
    return p;
}

@Bean(value="miki")
    public Parrot parrot3(){
    Parrot p = new Parrot();
    p.setName("Parrot");
    return p;
}

@Bean("uuuu")
    public Parrot parrot6(){
    Parrot p = new Parrot();
    p.setName("uuuuu");
    return p;
}
}
