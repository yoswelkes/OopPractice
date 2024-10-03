package attendance.tests;

import java.util.List;
import attendance.Class;
import attendance.Math;
import attendance.Italian;

public class ClassTest {
    public static void main(String[] args) {
        // Testing the Math class
        Math mathClass = new Math();
        System.out.println("\nTesting Math class:");
        mathClass.takeAttendance("Alice");
        mathClass.takeAttendance("Bob");

        List<String> mathAttendance = mathClass.getAttendanceList();
        System.out.println("Math Attendance List: " + mathAttendance); // Should print [Alice, Bob]

        // Testing the Italian class
        Italian italianClass = new Italian();
        System.out.println("\nTesting Italian class:");
        italianClass.takeAttendance("Carla");
        italianClass.takeAttendance("David");

        List<String> italianAttendance = italianClass.getAttendanceList();
        System.out.println("Italian Attendance List: " + italianAttendance); // Should print [Carla, David]

        // Test cases
        assert mathAttendance.size() == 2 : "Math attendance size should be 2";
        assert mathAttendance.contains("Alice") : "Math attendance should contain Alice";
        assert mathAttendance.contains("Bob") : "Math attendance should contain Bob";

        assert italianAttendance.size() == 2 : "Italian attendance size should be 2";
        assert italianAttendance.contains("Carla") : "Italian attendance should contain Carla";
        assert italianAttendance.contains("David") : "Italian attendance should contain David";

        System.out.println("\nAll test cases passed!");
    }
}

