package org.example.proxies;

import org.example.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("Email")
public class EmailCommentProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending Notification for comment "+ comment.getText());
    }
}

