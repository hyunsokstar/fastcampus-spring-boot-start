package org.example;

import java.util.List;


public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    public double calculateGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();
        // double multipliedCreditAndCourseGrade = 0;
        // for (Course course : courses) {
        // multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        // }

        // int totalCompletedCredit = courses.stream()
        // .mapToInt(Course::getCredit)
        // .sum();
        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;

    }

}
