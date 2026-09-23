package org.example;

import org.example.config.ProjectConfig;
import org.example.instance.ColorfulParrot;
import org.example.instance.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        ColorfulParrot p = (ColorfulParrot)context.getBean(ColorfulParrot.class);
    System.out.println(p.getColor());
    }
}