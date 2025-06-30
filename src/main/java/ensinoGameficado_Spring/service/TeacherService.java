package ensinoGameficado_Spring.service;

import ensinoGameficado_Spring.model.Teacher;
import ensinoGameficado_Spring.repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    private TeacherRepository repository;

    public Teacher saveTeacher(Teacher teacher){
        return repository.save(teacher);
    }
}
