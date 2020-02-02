package pl.testy.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.testy.test.repository.TestRepository;
import pl.testy.test.dto.TestDto;
import pl.testy.test.dto.mapper.TestMapper;

@RestController
@CrossOrigin
public class TestController {

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private TestRepository testRepository;

    @GetMapping("/{id}")
    public TestDto sayHello(@PathVariable Long id) {

        return testMapper.mapToTestDto(testRepository.findById(id).get());
    }

}
