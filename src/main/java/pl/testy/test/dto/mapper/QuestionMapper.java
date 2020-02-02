package pl.testy.test.dto.mapper;

import pl.testy.test.dto.QuestionDto;
import pl.testy.test.model.quiz.Answer;
import pl.testy.test.model.quiz.Question;

import java.util.List;
import java.util.stream.Collectors;

public class QuestionMapper {

    public QuestionDto mapToQuestionDto(Question question) {
        QuestionDto questionDto = new QuestionDto(question.getContent());
        questionDto.setId(question.getId());

        List<Answer> answers = question.getAnswers();

        List <String> ans =
                answers.stream()
                        .map(s->s.getName())
                        .collect(Collectors.toList());

        questionDto.setOptions(ans);

        questionDto.setAnswer(
                answers.stream()
                        .filter(x -> x.isCorrect())
                        .map(a->a.getName())
                        .collect(Collectors.joining()));

        return questionDto;
    }

    public List<QuestionDto> mapToListQuestionDto(List<Question> questions) {

        return questions.stream()
                .map(question -> mapToQuestionDto(question))
                .collect(Collectors.toList());
    }
}
