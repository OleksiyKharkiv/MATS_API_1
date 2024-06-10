package com.games.dndBE.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

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

        if (optInMarketingEmails != user.optInMarketingEmails) return false;
        if (optInTracking != user.optInTracking) return false;
        if (!id.equals(user.id)) return false;
        if (!username.equals(user.username)) return false;
        if (!firstName.equals(user.firstName)) return false;
        if (!lastName.equals(user.lastName)) return false;
        if (!email.equals(user.email)) return false;
        if (!photo.equals(user.photo)) return false;
        if (!birthday.equals(user.birthday)) return false;
        if (!gender.equals(user.gender)) return false;
        if (!location.equals(user.location)) return false;
        if (!sportTypes.equals(user.sportTypes)) return false;
        if (!unitType.equals(user.unitType)) return false;
        if (!userType.equals(user.userType)) return false;
        if (!accountType.equals(user.accountType)) return false;
        if (!language.equals(user.language)) return false;
        if (!defaultUserProfileId.equals(user.defaultUserProfileId)) return false;
        if (!created.equals(user.created)) return false;
        if (!modified.equals(user.modified)) return false;
        if (!registerCompleted.equals(user.registerCompleted)) return false;
        return subscription.equals(user.subscription);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + photo.hashCode();
        result = 31 * result + birthday.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + location.hashCode();
        result = 31 * result + sportTypes.hashCode();
        result = 31 * result + unitType.hashCode();
        result = 31 * result + userType.hashCode();
        result = 31 * result + accountType.hashCode();
        result = 31 * result + language.hashCode();
        result = 31 * result + (optInMarketingEmails ? 1 : 0);
        result = 31 * result + (optInTracking ? 1 : 0);
        result = 31 * result + defaultUserProfileId.hashCode();
        result = 31 * result + created.hashCode();
        result = 31 * result + modified.hashCode();
        result = 31 * result + registerCompleted.hashCode();
        result = 31 * result + subscription.hashCode();
        return result;
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