package corp.stickman.emailmanager.services;

import corp.stickman.emailmanager.models.UserCheckHistory;
import corp.stickman.emailmanager.repositories.UserCheckHistoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class UserCheckHistoryService {

    private final UserCheckHistoryRepository userCheckHistoryRepository;

    public UserCheckHistoryService(UserCheckHistoryRepository userCheckHistoryRepository) {
        this.userCheckHistoryRepository = userCheckHistoryRepository;
    }


    public boolean isValidUser(Integer userId) {
        //TODO: Implement validity check
        // Record the event
        userCheckHistoryRepository.save(
                UserCheckHistory.builder()
                        .isValidUser(true)
                        .userId(userId)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        // Return a default value for now
        return true;
    }
}
