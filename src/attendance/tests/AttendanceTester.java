package attendance.tests;

import java.util.List;
import attendance.*;


public class AttendanceTester {
    public static void main(String[] args) {
        // Create Teacher and Student objects
        Teacher teacher1 = new Teacher("Mrs. Smith", 101, "Math");
        Student student1 = new Student("Alice", 1001, "A");
        Student student2 = new Student("Bob", 1002, "B");

        // Testing the Math class with Teacher and Students
        attendance.Math mathClass = new attendance.Math();
        System.out.println("\nTesting Math class:");
        mathClass.takeAttendance(teacher1);  // Teacher attendance
        mathClass.takeAttendance(student1);  // Student attendance
        mathClass.takeAttendance(student2);  // Student attendance

        List<String> mathAttendance = mathClass.getAttendanceList();
        System.out.println("Math Attendance List: " + mathAttendance);

        // Testing the Italian class with Students
        Italian italianClass = new Italian();
        System.out.println("\nTesting Italian class:");
        italianClass.takeAttendance(student1);  // Student attendance
        italianClass.takeAttendance(student2);  // Student attendance

        List<String> italianAttendance = italianClass.getAttendanceList();
        System.out.println("Italian Attendance List: " + italianAttendance);

        // Assertions (using simple print statements to validate)
        assert mathAttendance.size() == 3 : "Math attendance size should be 3";
        assert italianAttendance.size() == 2 : "Italian attendance size should be 2";

        System.out.println("\nAll test cases passed!");
    }
}
