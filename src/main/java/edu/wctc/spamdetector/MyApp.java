package edu.wctc.spamdetector;


import edu.wctc.spamdetector.validator.ICommentValidator;
import edu.wctc.spamdetector.validator.ProjectHoneyPotValidator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.spamdetector")
public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyApp.class);
        context.refresh();

        ((CommentManager) context.getBean("commentManager"))
                .addComment("Best post ever!");
    }

    @Bean
    public ICommentValidator commentValidator() {
//        return new AkismetValidator();
        return new ProjectHoneyPotValidator();
    }

}
