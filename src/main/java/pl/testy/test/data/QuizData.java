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

        Test test = new Test("About everything");
        Question question = new Question("What is The Capital of Poland");
        question.addAnswer(new Answer("Warsaw",true));
        question.addAnswer(new Answer("Mumbai",false));
        question.addAnswer(new Answer("Kolkatta",false));
        Question question3 = new Question("Name World's Richest Man?");
        question3.addAnswer(new Answer("Jeff Bazo",false));
        question3.addAnswer(new Answer("Bill Gates",false));
        question3.addAnswer(new Answer("Mark Zuckenberg",true));
        Question question4 = new Question("Word's Longest River?");
        question4.addAnswer(new Answer("River Nile",true));
        question4.addAnswer(new Answer("River Amazon",false));
        question4.addAnswer(new Answer("River Godavari",false));
        test.addQuestion(question);
        test.addQuestion(question3);
        testRepository.save(test);
    }
}
