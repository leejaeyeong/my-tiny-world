package com.example.notification.dto;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import lombok.Getter;
<<<<<<< HEAD

@Getter
public class NotifyRequest {
    private String text;
=======
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(staticName = "of")
public class NotifyRequest {
    private final String text;
>>>>>>> 7659d35 ([jylee] slack 알림 구현 (#11))
}
=======
public record NotifyRequest(String text) {}
>>>>>>> af97532 (fix: record, 컬럼 길이 제한 수정)
=======
public record NotifyRequest(String text) {}
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
import com.example.notification.dto.slack.blocks.Block;

import java.util.List;

public record NotifyRequest(String text, List<Block> blocks) {}
>>>>>>> aafb7fe (feat: slack 메세지 전송 형식 구현)
