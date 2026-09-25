package org.example;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy //we can use this annotation on top of the bean method for Lazy Instantiation in the configuration class.
public class CommentService {

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    private final CommentRepository commentRepository; // we have declared the CommentRepository in the class level and the commentRespository is singleton during context loading commentService bean created for commentService bean repository bean is required so it instiate it with repo bean and the same bean is used the whole time.
    CommentService(CommentRepository commentRepository){
        this.commentRepository=commentRepository;
        System.out.println("CommentService Bean Created By lazy Instiation ");
    }



}
