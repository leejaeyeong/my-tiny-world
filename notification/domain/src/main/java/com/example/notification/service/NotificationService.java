package com.example.notification.service;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
import com.example.exception.NotFoundNotificationException;
import com.example.notification.dto.NotificationDto;
import com.example.notification.entity.Notification;
import com.example.notification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
<<<<<<< HEAD
=======
import com.example.notification.entity.Notification;
import com.example.notification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))

    public Page<NotificationDto> findAll(Pageable pageable) {
        return notificationRepository.findAll(pageable).map(NotificationDto::of);
    }

    public NotificationDto findById(Long id) {
        Notification notification = notificationRepository.findById(id)
                .orElseThrow(() -> new NotFoundNotificationException(id));

        return NotificationDto.of(notification);
    }

    @Transactional
    public NotificationDto update(Long id, NotificationDto notificationDto) {
        Notification notification = notificationRepository.findById(id)
                .orElseThrow(() -> new NotFoundNotificationException(id));

        return NotificationDto.of(notification.updateNotificationInfo(notificationDto));
    }

    public void deleteById(Long id) {
        notificationRepository.deleteById(id);
    }
<<<<<<< HEAD
=======
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
}
