package attendance;

public class Student implements Person {
    private String name;
    private int studentID;
    private String grade;

    public Student(String name, int studentID, String grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }

    @Override
    public String getAttendanceString() {
        return "Student " + name + " (ID: " + studentID + ")";
    }

    // Getters and toString method for testing
    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", grade='" + grade + '\'' +
                '}';
    }
}
