package pl.testy.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.testy.test.model.quiz.Test;

@Repository
public interface TestRepository extends CrudRepository<Test,Long> {
}
