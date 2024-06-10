package com.api.matsAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Data
@Document(collection = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;

    private String username;
    private String firstName;
    private String lastName;
    private String email;

    private Photo photo;
    private LocalDateTime birthday;
    private String gender;
    private String location;

    private List<String> sportTypes;
    private String unitType;
    private String userType;
    private String accountType;
    private String language;
    private boolean optInMarketingEmails;
    private boolean optInTracking;
    private String defaultUserProfileId;

    private TimestampInfo created;
    private TimestampInfo modified;
    private LocalDateTime registerCompleted;

    private Subscription subscription;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", photo=" + photo +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", location='" + location + '\'' +
                ", sportTypes=" + sportTypes +
                ", unitType='" + unitType + '\'' +
                ", userType='" + userType + '\'' +
                ", accountType='" + accountType + '\'' +
                ", language='" + language + '\'' +
                ", optInMarketingEmails=" + optInMarketingEmails +
                ", optInTracking=" + optInTracking +
                ", defaultUserProfileId='" + defaultUserProfileId + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", registerCompleted=" + registerCompleted +
                ", subscription=" + subscription +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return optInMarketingEmails == user.optInMarketingEmails &&
                optInTracking == user.optInTracking &&
                Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(photo, user.photo) &&
                Objects.equals(birthday, user.birthday) &&
                Objects.equals(gender, user.gender) &&
                Objects.equals(location, user.location) &&
                Objects.equals(sportTypes, user.sportTypes) &&
                Objects.equals(unitType, user.unitType) &&
                Objects.equals(userType, user.userType) &&
                Objects.equals(accountType, user.accountType) &&
                Objects.equals(language, user.language) &&
                Objects.equals(defaultUserProfileId, user.defaultUserProfileId) &&
                Objects.equals(created, user.created) &&
                Objects.equals(modified, user.modified) &&
                Objects.equals(registerCompleted, user.registerCompleted) &&
                Objects.equals(subscription, user.subscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, firstName, lastName, email, photo, birthday, gender, location, sportTypes, unitType, userType, accountType, language, optInMarketingEmails, optInTracking, defaultUserProfileId, created, modified, registerCompleted, subscription);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Photo {
        private String url;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TimestampInfo {
        private String userId;
        private LocalDateTime timestamp;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Subscription {
        private String subscriptionStatus;
        private String offeringId;
        private String productId;
        private String transactionId;
        private String originalTransactionId;
        private boolean boughtByCoach;
        private LocalDateTime modified;
        private LocalDateTime userSubscriptionModified;
    }
}