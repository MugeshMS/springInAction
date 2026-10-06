package org.example.services;

import org.example.Comment;
import org.example.EditLog;
import org.example.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Inside the publish Comment()");
    }
    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Deleting comment:"+comment.getText());
    }
    @EditLog
    public void editComment(Comment comment){
        logger.info("Editing comment of :"+comment.getAuthor());
    }
}