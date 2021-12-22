package corp.stickman.emailmanager.controllers;

import corp.stickman.emailmanager.dtos.EmailCheckHistoryDTO;
import corp.stickman.emailmanager.services.UserCheckHistoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/check")
public class UserHistoryController {

    private UserCheckHistoryService userCheckHistoryService;

    public UserHistoryController(UserCheckHistoryService userCheckHistoryService) {
        this.userCheckHistoryService = userCheckHistoryService;
    }


    @GetMapping(path = "{userId}")
    public EmailCheckHistoryDTO isValidUser(@PathVariable("userId") Integer userId) {
        boolean isValidUser = userCheckHistoryService.isValidUser(userId);
        return new EmailCheckHistoryDTO(isValidUser);
    }
}
