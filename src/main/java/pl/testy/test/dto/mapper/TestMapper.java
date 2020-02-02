package pl.testy.test.dto.mapper;

import org.springframework.stereotype.Component;
import pl.testy.test.dto.TestDto;
import pl.testy.test.model.quiz.Test;

@Component
public class TestMapper {
    private QuestionMapper questionMapper = new QuestionMapper();

    public TestDto mapToTestDto(Test test) {
        TestDto testDto = new TestDto();

        testDto.setName(test.getName());
        testDto.setQuestions(questionMapper.mapToListQuestionDto(test.getQestions()));

        return testDto;
    }

}
