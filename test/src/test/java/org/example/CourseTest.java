package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {

    @DisplayName("과목(코스)를 생성 해보자")
    @Test
    void createTest() {
        System.out.println("test 실행 확인");
        assertThatCode(() -> new Course("oop", 3, "A+"))
                .doesNotThrowAnyException();
    }

}
