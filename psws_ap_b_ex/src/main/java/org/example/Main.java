package org.example;

import org.example.config.ProjectConfig;
import org.example.instance.ColorfulParrot;
import org.example.instance.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

public class Main {
    public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        ColorfulParrot p = (ColorfulParrot)context.getBean(ColorfulParrot.class);
    System.out.println(p.getColor());
    }
}
