package org.example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * 요구 사항
 * 평균 학점 계산 방법 (학점수 * 교과목 평점) 의 합계  / 수강 신청한 총 학점 수
 */
public class GradleCalculatorTest {

    @DisplayName("평균 학점을 계산 한다")
    @Test
    void calculateGradeTest() {
        List<Course> courses =
                List.of(
                        new Course("OOP", 3, "A+"),
                        new Course("자료 구조", 3, "A+")
                );

        //  GradeCalculator gradeCalculator = new GradeCalculator(courses);
        GradeCalculator gradeCalculator = new GradeCalculator(new Courses(courses));

        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }

}
