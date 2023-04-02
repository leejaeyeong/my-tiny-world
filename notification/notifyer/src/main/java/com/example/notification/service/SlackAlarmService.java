package com.example.notification.service;

import com.example.notification.config.NotifyProperties;
import com.example.notification.dto.NotifyRequest;
<<<<<<< HEAD
<<<<<<< HEAD
import com.example.notification.dto.NotifyRequestEvent;
import com.example.notification.entity.Notification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
=======
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
>>>>>>> 7659d35 ([jylee] slack 알림 구현 (#11))
=======
import com.example.notification.dto.NotifyRequestEvent;
import com.example.notification.entity.Notification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))

@Service
public class SlackAlarmService extends AbstractNotifyService {

<<<<<<< HEAD
<<<<<<< HEAD
    public SlackAlarmService(NotifyProperties notifyProperties, NotificationService notificationService) {
        super(notifyProperties, notificationService);
    }

    @Override
    @Transactional
    public void send(NotifyRequest notifyRequest) {
<<<<<<< HEAD
        notificationService.saveNotification(Notification.defaultOf(notifyRequest.getText()));
        this.send(NotifyRequestEvent.of(notifyRequest.getText(), notifyProperties.getSlack().getPath()));
=======
    public SlackAlarmService(NotifyProperties notifyProperties) {
        super(notifyProperties);
=======
    public SlackAlarmService(NotifyProperties notifyProperties, NotificationService notificationService) {
        super(notifyProperties, notificationService);
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
    }

    @Override
    @Transactional
    public void send(NotifyRequest notifyRequest) {
<<<<<<< HEAD
        super.send(notifyRequest);
>>>>>>> 7659d35 ([jylee] slack 알림 구현 (#11))
=======
        notificationService.saveNotification(Notification.defaultOf(notifyRequest.text()));
<<<<<<< HEAD
        this.send(NotifyRequestEvent.of(notifyRequest.text(), notifyProperties.getSlack().getPath()));
>>>>>>> af97532 (fix: record, 컬럼 길이 제한 수정)
=======
        notificationService.saveNotification(Notification.defaultOf(notifyRequest.text()));
        this.send(NotifyRequestEvent.of(notifyRequest.text(), notifyProperties.getSlack().getPath()));
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
        this.send(NotifyRequestEvent.of(notifyRequest, notifyProperties.getSlack().getPath()));
>>>>>>> aafb7fe (feat: slack 메세지 전송 형식 구현)
    }

}
