package ensinoGameficado_Spring.service;

import ensinoGameficado_Spring.dto.UserRegisterDTO;
import ensinoGameficado_Spring.exceptions.UserAlreadyExistsException;
import ensinoGameficado_Spring.model.Student;
import ensinoGameficado_Spring.model.Teacher;
import ensinoGameficado_Spring.model.User;
import ensinoGameficado_Spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final StudentService studentService;
    private final TeacherService teacherService;
    private final PasswordEncoder passwordEncoder;

    public User registerUser(UserRegisterDTO data) throws UserAlreadyExistsException{
        final Optional<User> userVerify = this.userRepository.findByEmail(data.email());

        if(userVerify.isPresent()){
            throw new UserAlreadyExistsException("Este Email foi cadastrado em outro usuario!");

        }else{
            return verifyUserTypeForCreate(data);
        }
    }

    public User verifyUserTypeForCreate(UserRegisterDTO data) {
        final String encryptPassword = new BCryptPasswordEncoder().encode(data.password());

        if (data.type().equalsIgnoreCase("aluno")) {
            final Student newStudent = new Student(data.name(), data.email(), encryptPassword);

            return studentService.saveStudent(newStudent);
        } else {
            final Teacher newTeacher = new Teacher(data.name(), data.email(), encryptPassword);

            return this.teacherService.saveTeacher(newTeacher);
        }
    }

    public boolean checkPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
