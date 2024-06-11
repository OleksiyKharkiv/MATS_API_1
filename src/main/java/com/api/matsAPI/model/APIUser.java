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
public class APIUser {
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
        return "APIUser{" +
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
        APIUser APIUser = (APIUser) o;
        return optInMarketingEmails == APIUser.optInMarketingEmails &&
                optInTracking == APIUser.optInTracking &&
                Objects.equals(id, APIUser.id) &&
                Objects.equals(username, APIUser.username) &&
                Objects.equals(firstName, APIUser.firstName) &&
                Objects.equals(lastName, APIUser.lastName) &&
                Objects.equals(email, APIUser.email) &&
                Objects.equals(photo, APIUser.photo) &&
                Objects.equals(birthday, APIUser.birthday) &&
                Objects.equals(gender, APIUser.gender) &&
                Objects.equals(location, APIUser.location) &&
                Objects.equals(sportTypes, APIUser.sportTypes) &&
                Objects.equals(unitType, APIUser.unitType) &&
                Objects.equals(userType, APIUser.userType) &&
                Objects.equals(accountType, APIUser.accountType) &&
                Objects.equals(language, APIUser.language) &&
                Objects.equals(defaultUserProfileId, APIUser.defaultUserProfileId) &&
                Objects.equals(created, APIUser.created) &&
                Objects.equals(modified, APIUser.modified) &&
                Objects.equals(registerCompleted, APIUser.registerCompleted) &&
                Objects.equals(subscription, APIUser.subscription);
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