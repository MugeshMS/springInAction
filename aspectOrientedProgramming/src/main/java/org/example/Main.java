package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Comment comment = new Comment();
        comment.setAuthor("Mugesh M S");
        comment.setText("Demo Comment");
        var service = context.getBean(CommentService.class);
        service.publishComment(comment);

    }
}