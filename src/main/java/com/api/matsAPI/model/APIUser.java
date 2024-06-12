package com.api.matsAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Data
@Document(collection = "user")
@NoArgsConstructor
@AllArgsConstructor
public class APIUser {
    @Id
    @Field("_id")
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
        APIUser apiUser = (APIUser) o;
        return Objects.equals(id, apiUser.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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