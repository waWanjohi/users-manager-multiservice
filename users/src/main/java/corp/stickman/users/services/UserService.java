package corp.stickman.users.services;


import corp.stickman.users.dtos.UserRegisterRequest;
import corp.stickman.users.models.User;
import corp.stickman.users.repositories.UserRepository;
import org.hibernate.annotations.Any;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    UserRepository userRepository;


    public void registerUser(UserRegisterRequest userRegisterRequest) {
        User user = User.builder()
                .userId(userRegisterRequest.userId())
                .firstName(userRegisterRequest.firstName())
                .lastName(userRegisterRequest.lastName())
                .email(userRegisterRequest.email())
                .phoneNumber(userRegisterRequest.phoneNumber())
                .businessNumber(userRegisterRequest.businessNumber())
                .passportNumber(userRegisterRequest.passportNumber())
                .build();

        userRepository.save(user);
    }

}
