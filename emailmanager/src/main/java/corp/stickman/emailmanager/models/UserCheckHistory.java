package corp.stickman.emailmanager.models;


import lombok.Builder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Table(name = "user_check_history")
public class UserCheckHistory {
    @Id
    @SequenceGenerator(name = "history_check_sequence", sequenceName = "history_check_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "valid_user")
    private Boolean isValidUser;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Integer getId() {
        return id;
    }


    public Integer getUserId() {
        return userId;
    }


    public Boolean getValidUser() {
        return isValidUser;
    }

    public void setValidUser(Boolean validUser) {
        isValidUser = validUser;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public UserCheckHistory() {

    }

    public UserCheckHistory(Integer id, Integer userId, Boolean isValidUser, LocalDateTime createdAt) {
        this.id = id;
        this.userId = userId;
        this.isValidUser = isValidUser;
        this.createdAt = createdAt;
    }
}
