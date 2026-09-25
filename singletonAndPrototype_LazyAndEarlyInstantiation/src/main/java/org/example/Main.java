package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class); // UserService Bean is created when the Context is initialized which Eager
    CommentService commentService = context.getBean(CommentService.class);//at this line only Comment Service bean is created it is lazy
    CommentService commentService1 = context.getBean(CommentService.class);
        UserService userService = context.getBean(UserService.class);
    if(commentService.getCommentRepository()==userService.getCommentRepository()){
        System.out.println("Both Are Same");
    }else{
        System.out.println("No bro Both are not same");
    }
    var protoCommentService = context.getBean(ProtoCommentService.class);
    var protoCommentService1 = context.getBean(ProtoCommentService.class);
    System.out.println(commentService.getCommentRepository()); //look carefully at the bean address and see the class definition and the comment repository definition
    System.out.println(commentService1.getCommentRepository());
    System.out.println("Now lets see the ProtoCommentService");
    System.out.println(protoCommentService.getCommentRepository()); //look carefully at the bean address and see the class definition and the comment repository definition
    System.out.println(protoCommentService1.getCommentRepository());

    }
}