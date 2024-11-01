package com.ite.notification_ms.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "notifications")
public class Notification {

    @Id
    private Long id;

    // Title or subject of the notification
    private String title;

    // The main content or body of the notification
    private String message;

    // Type of notification (e.g., "EMAIL", "SMS", "PUSH")
    private String type;

    // Target user or entity ID for the notification
    private Long targetUserId;

    // Status of the notification (e.g., "PENDING", "SENT", "FAILED")
    private String status;

    // Priority level (optional: "LOW", "MEDIUM", "HIGH")
    private String priority;

    // Template ID to use for structured notifications
    private Long templateId;

    // Date and time the notification was created
    private LocalDateTime createdAt;

    // Date and time the notification was sent
    private LocalDateTime sentAt;

    // Date and time to send the notification (for scheduled notifications)
    private LocalDateTime scheduledFor;

    // Extra metadata (optional, can use JSON if supported)
    private Map<String, String> metadata;
}
