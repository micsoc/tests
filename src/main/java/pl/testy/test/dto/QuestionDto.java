package pl.testy.test.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {

    Long id;
    String content;
    List<String> options;
    String answer;

    public QuestionDto(String content) {
        this.content = content;
    }
}
