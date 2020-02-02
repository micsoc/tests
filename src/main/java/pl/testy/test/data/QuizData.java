package pl.testy.test.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.testy.test.model.quiz.Answer;
import pl.testy.test.model.quiz.Question;
import pl.testy.test.model.quiz.Test;
import pl.testy.test.repository.TestRepository;

@Component
public class QuizData implements CommandLineRunner {

    @Autowired
    TestRepository testRepository;

    @Override
    public void run(String... args) throws Exception {
    }
}
