package ensinoGameficado_Spring.service;

import ensinoGameficado_Spring.model.Student;
import ensinoGameficado_Spring.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }

}
