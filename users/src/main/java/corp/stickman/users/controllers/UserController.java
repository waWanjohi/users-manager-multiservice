package corp.stickman.users.controllers;

import corp.stickman.users.dtos.UserRegisterRequest;
import corp.stickman.users.models.User;
import corp.stickman.users.repositories.UserRepository;
import corp.stickman.users.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public record UserController(UserService userService, UserRepository userRepository) {
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        log.info("Getting all users");
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping
    public void registerNewUser(@RequestBody UserRegisterRequest userRegisterRequest) {
        log.info("Register new user {}", userRegisterRequest.userId());
        userService.registerUser(userRegisterRequest);
    }
}
