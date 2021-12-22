package corp.stickman.users.dtos;

public record UserRegisterRequest(
        Integer userId,
        String firstName,
        String lastName,
        String email,
        Integer phoneNumber,
        Integer businessNumber,
        Integer passportNumber ) {
}
