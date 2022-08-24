package edu.wctc.spamdetector;

import edu.wctc.spamdetector.services.DatabaseConnection;
import edu.wctc.spamdetector.validator.ICommentValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentManager {
    @Autowired
    private ICommentValidator validator;

    public CommentManager(ICommentValidator validator) {
        this.validator = validator;
    }

    public void addComment(String comment) {
        if (validateNotSpam()) {
            DatabaseConnection.saveComment(comment);
            System.out.println("Comment saved");
        } else {
            System.out.println("Spam detected");
        }
    }

    private boolean validateNotSpam() {
//        return ProjectHoneyPot.isSpam();
        return validator.validate();
    }
}
