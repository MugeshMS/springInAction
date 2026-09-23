package org.example;

import org.example.config.ProjectConfig;
import org.example.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.model.Comment;

public class Main {
    public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setAuthor("Mugesh M S");
        comment.setText("Spring Context DI");
        commentService.publishComment(comment);
    }
}