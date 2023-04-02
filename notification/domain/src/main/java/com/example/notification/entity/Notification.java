package com.example.notification.entity;

import com.example.notification.define.NotificationType;
import com.example.notification.define.SeverityLevel;
import com.example.notification.dto.NotificationDto;
import com.example.notification.util.CommonUtil;
import jakarta.persistence.*;
<<<<<<< HEAD
<<<<<<< HEAD
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@Entity
@DynamicUpdate
=======
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

=======
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))

@Getter
@Entity
<<<<<<< HEAD
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
@DynamicUpdate
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Notification extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;

    @Enumerated(EnumType.STRING)
    private SeverityLevel severityLevel;

    @Column(length = 30)
    private String message;

    @Builder
    private Notification(Long id, NotificationType notificationType, SeverityLevel severityLevel, String message) {
        this.id = id;
        this.notificationType = notificationType;
        this.severityLevel = severityLevel;
        this.message = message;
    }

    public static Notification defaultOf(String message) {
        return Notification.builder()
                .notificationType(NotificationType.GENERAL)
                .severityLevel(SeverityLevel.INFO)
                .message(message)
                .build();
    }

    public Notification updateNotificationInfo(NotificationDto notificationDto) {
        CommonUtil.nonNull(notificationDto.getNotificationType());
        CommonUtil.nonNull(notificationDto.getSeverityLevel());
        CommonUtil.nonNull(notificationDto.getMessage());

        this.notificationType = notificationDto.getNotificationType();
        this.severityLevel = notificationDto.getSeverityLevel();
        this.message = notificationDto.getMessage();

        return this;
    }
}
