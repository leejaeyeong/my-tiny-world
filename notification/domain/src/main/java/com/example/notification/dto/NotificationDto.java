package com.example.notification.dto;

import com.example.notification.define.NotificationType;
import com.example.notification.define.SeverityLevel;
import com.example.notification.entity.Notification;
import com.example.notification.util.CommonUtil;
import lombok.Builder;
import lombok.Getter;

@Getter
public class NotificationDto {
    private Long id;
    private NotificationType notificationType;
    private SeverityLevel severityLevel;
<<<<<<< HEAD
<<<<<<< HEAD
    private String message;

    @Builder
    public NotificationDto(Long id, NotificationType notificationType, SeverityLevel severityLevel, String message) {
        this.id = id;
        this.notificationType = notificationType;
        this.severityLevel = severityLevel;
        this.message = message;
=======
=======
    private String message;
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))

    @Builder
    public NotificationDto(Long id, NotificationType notificationType, SeverityLevel severityLevel, String message) {
        this.id = id;
        this.notificationType = notificationType;
        this.severityLevel = severityLevel;
<<<<<<< HEAD
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
        this.message = message;
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
    }

    public Notification toEntity() {
        CommonUtil.nonNull(id, notificationType, severityLevel);

        return Notification.builder()
                .id(id)
                .notificationType(notificationType)
                .severityLevel(severityLevel)
                .build();
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
    public static NotificationDto of(Notification notification) {
        return NotificationDto.builder()
                .id(notification.getId())
                .notificationType(notification.getNotificationType())
                .severityLevel(notification.getSeverityLevel())
                .message(notification.getMessage())
                .build();
    }
<<<<<<< HEAD

=======
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
}
