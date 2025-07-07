package ensinoGameficado_Spring.controller;

import ensinoGameficado_Spring.dto.UserLoginDTO;
import ensinoGameficado_Spring.dto.UserRegisterDTO;
import ensinoGameficado_Spring.exceptions.UserAlreadyExistsException;
import ensinoGameficado_Spring.infra.security.TokenService;
import ensinoGameficado_Spring.model.User;
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
    private final TokenService tokenService;

    @PostMapping("/register")
    public ResponseEntity<UserRegisterDTO> register(@RequestBody UserRegisterDTO userRegisterDTO) throws UserAlreadyExistsException {

            this.userService.registerUser(userRegisterDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(userRegisterDTO);
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginDTO userLoginDTO){
        User user = userService.userByEmail(userLoginDTO.email());

        if(userService.checkPassword(userLoginDTO.password(), user.getPassword())){
            String token = this.tokenService.generateToken(user);
            return ResponseEntity.ok(token);
        }
        return ResponseEntity.badRequest().build();
    }
}
