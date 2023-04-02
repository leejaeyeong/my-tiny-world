package com.example.notification.util;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.*;
=======
import java.util.Arrays;
import java.util.Objects;
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
import java.util.*;
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))

public class CommonUtil {

    public static void nonNull(Object object) {
        if (Objects.nonNull(object)) {
            throw new NullPointerException();
        }
    }

    public static void nonNull(Object... objects) {
        Arrays.stream(objects)
                .forEach(CommonUtil::nonNull);
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))

    public static boolean isEmpty(Object o) {

        if (o instanceof String) {
            return ((String) o).isEmpty();
        }

        if (o instanceof Integer) {
            return ((Integer) o) == 0;
        }

        if (o instanceof Double) {
            return ((Double) o) == 0D;
        }

        if (o instanceof Float) {
            return ((Float) o) == 0F;
        }

        if (o instanceof Long) {
            return ((Long) o) == 0L;
        }

        if (o instanceof Map) {
            return ((Map<?, ?>) o).isEmpty();
        }

        return ((Collection<?>) o).isEmpty();
    }
<<<<<<< HEAD
=======
>>>>>>> 6db125b ([jylee] 알림 프로필 변경 및 알림 이력 데이터 저장 구현 (#16))
=======
>>>>>>> cdf1a7b ([jylee] 알림 CRUD 및 공통 예외 정의 (#21))
}
