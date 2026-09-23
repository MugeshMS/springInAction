import model.Comment;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import service.CommentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentProxy();
        var comment = new Comment();
        comment.setText("Demo Commment");
        comment.setAuthor("Mugesh M S");
        CommentService commentService = new CommentService(commentNotificationProxy,commentRepository);
        commentService.publishComment(comment);
    }
}