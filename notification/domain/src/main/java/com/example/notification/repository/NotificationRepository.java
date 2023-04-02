package com.example.notification.repository;

import com.example.notification.entity.Notification;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
=======
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
<<<<<<< HEAD
<<<<<<< HEAD
    Page<Notification> findAll(Pageable pageable);
=======
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
    Page<Notification> findAll(Pageable pageable);
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
}
