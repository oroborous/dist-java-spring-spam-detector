package edu.wctc.spamdetector.validator;

import edu.wctc.spamdetector.services.ProjectHoneyPot;

public class ProjectHoneyPotValidator implements ICommentValidator {
    @Override
    public boolean validate() {
        return ProjectHoneyPot.isSpam();
    }
}