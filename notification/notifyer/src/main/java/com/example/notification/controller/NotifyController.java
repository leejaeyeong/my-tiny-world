package com.example.notification.controller;

import com.example.notification.dto.NotifyRequest;
import com.example.notification.dto.NotifyResponse;
import com.example.notification.service.SlackAlarmService;
<<<<<<< HEAD
<<<<<<< HEAD
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
>>>>>>> 7659d35 ([jylee] slack 알림 구현 (#11))
=======
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))

@Slf4j
@RestController
@RequestMapping("/notify")
@RequiredArgsConstructor
public class NotifyController {

    private final SlackAlarmService slackAlarmService;

    @PostMapping("/test")
    public ResponseEntity<NotifyResponse> notifyBasicMessage(@RequestBody NotifyRequest notifyRequest) {
        slackAlarmService.send(notifyRequest);
        return ResponseEntity.ok(NotifyResponse.of(notifyRequest.text()));
    }
}
