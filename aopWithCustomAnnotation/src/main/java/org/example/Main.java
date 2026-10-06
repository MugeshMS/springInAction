package org.example;

import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
    var context  = new AnnotationConfigApplicationContext(ProjectConfig.class);
     CommentService service =context.getBean(CommentService.class);
        Comment comment  = new Comment("Demo text","Mugesh M S");
//        service.deleteComment(comment);
        service.editComment(comment);
    }
}