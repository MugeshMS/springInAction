package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class); // UserService Bean is created when the Context is initialized which Eager
    CommentService commentService = context.getBean(CommentService.class);//at this line only Comment Service bean is created it is lazy
    UserService userService = context.getBean(UserService.class);
    if(commentService.getCommentRepository()==userService.getCommentRepository()){
        System.out.println("Both Are Same");
    }else{
        System.out.println("No bro Both are not same");
    }
    }
}