package org.example;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    private final CommentRepository commentRepository;

UserService(CommentRepository commentRepository){
    this.commentRepository=commentRepository;
    System.out.println("UserService Bean created by Eager Instantiaton ");
}
}
