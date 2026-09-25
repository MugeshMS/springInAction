package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class ProtoCommentService {
        @Autowired
    AnnotationConfigApplicationContext annotationConfigApplicationContext;
    CommentRepository getCommentRepository(){
        return annotationConfigApplicationContext.getBean(CommentRepository.class); // if you get the commentrepository inside the class it will give the same bean every time because ProtoCommentService is singleton and it is instantiated during context loading
    }
}
