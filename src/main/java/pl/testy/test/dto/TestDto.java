package pl.testy.test.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TestDto {

    private String name;

    private List<QuestionDto> questions = new ArrayList<>();


}
