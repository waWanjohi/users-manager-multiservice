package corp.stickman.users.models;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Builder
public class User {
    @Id
    @SequenceGenerator(name = "users_id_sequence", sequenceName = "users_id_sequence")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    public Integer userId;
    @Column(name = "first_name")
    public String firstName;
    @Column(name = "last_name")
    public String lastName;
    @Column(name = "email")
    public String email;
    @Column(name = "phone_number")
    public Integer phoneNumber;
    @Column(name = "business_number")
    public Integer businessNumber;
    @Column(name = "passport_number")
    public Integer passportNumber;

    public User() {
    }

    public User(Integer userId, String firstName, String lastName, String email, Integer phoneNumber, Integer businessNumber, Integer passportNumber) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.businessNumber = businessNumber;
        this.passportNumber = passportNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(Integer businessNumber) {
        this.businessNumber = businessNumber;
    }

    public Integer getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Integer passportNumber) {
        this.passportNumber = passportNumber;
    }
}
