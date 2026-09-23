package proxies;

import model.Comment;

public class EmailCommentProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending Notification for comment "+ comment.getText());
    }
}
