package edu.wctc.spamdetector.validator;

import edu.wctc.spamdetector.services.Akismet;

public class AkismetValidator implements ICommentValidator {
    @Override
    public boolean validate() {
        return Akismet.isBlacklisted();
    }
}