package com.example.notification.define;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
<<<<<<< HEAD
<<<<<<< HEAD
public enum NotificationType implements CommonType<String, String> {
=======
public enum NotificationType implements CommonType {
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
public enum NotificationType implements CommonType<String, String> {
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
    GENERAL("GENERAL", "일반 알림");

    private final String code;
    private final String desc;
}
