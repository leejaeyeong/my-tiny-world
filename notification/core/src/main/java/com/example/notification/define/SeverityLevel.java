package com.example.notification.define;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
<<<<<<< HEAD
<<<<<<< HEAD
public enum SeverityLevel implements CommonType<String, String> {
=======
public enum SeverityLevel implements CommonType {
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
public enum SeverityLevel implements CommonType<String, String> {
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
    FATAL("FATAL", "치명적 오류"),
    ERROR("ERROR", "일반적 오류"),
    WARNING("WARNING", "경고"),
    INFO("INFO", "일반적인 정보"),
    DEBUG("DEBUG", "디버그 정보"),
    TRACE("TRACE", "디버그 추적 정보");

    private final String code;
    private final String desc;
}
