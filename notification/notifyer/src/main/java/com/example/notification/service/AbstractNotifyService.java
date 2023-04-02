package com.example.notification.service;

import com.example.notification.config.NotifyProperties;
import com.example.notification.dto.NotifyRequest;
<<<<<<< HEAD
<<<<<<< HEAD
import com.example.notification.dto.NotifyRequestEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public abstract class AbstractNotifyService implements NotifyService {

    protected final NotifyProperties notifyProperties;
    protected final NotificationService notificationService;

    @Override
    public abstract void send(NotifyRequest notifyRequest);

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void send(NotifyRequestEvent notifyRequestEvent) {
        WebClient.create()
                .post()
                .uri(notifyRequestEvent.getUri())
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(notifyRequestEvent), NotifyRequestEvent.class)
=======
import lombok.Getter;
=======
import com.example.notification.dto.NotifyRequestEvent;
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public abstract class AbstractNotifyService implements NotifyService {

    protected final NotifyProperties notifyProperties;
    protected final NotificationService notificationService;

    @Override
    public abstract void send(NotifyRequest notifyRequest);

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void send(NotifyRequestEvent notifyRequestEvent) {
        WebClient.create()
                .post()
                .uri(notifyRequestEvent.getUri())
                .contentType(MediaType.APPLICATION_JSON)
<<<<<<< HEAD
                .body(Mono.just(notifyRequest), NotifyRequest.class)
>>>>>>> 7659d35 ([jylee] slack 알림 구현 (#11))
=======
                .body(Mono.just(notifyRequestEvent), NotifyRequestEvent.class)
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
