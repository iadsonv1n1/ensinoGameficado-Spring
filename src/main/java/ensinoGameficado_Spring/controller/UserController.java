package ensinoGameficado_Spring.controller;

import ensinoGameficado_Spring.dto.UserRegisterDTO;
import ensinoGameficado_Spring.exceptions.UserAlreadyExistsException;
import ensinoGameficado_Spring.repository.StudentRepository;
import ensinoGameficado_Spring.service.StudentService;
import ensinoGameficado_Spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserRegisterDTO> register(@RequestBody UserRegisterDTO userRegisterDTO) throws UserAlreadyExistsException {

            this.userService.registerUser(userRegisterDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(userRegisterDTO);
    }
}
