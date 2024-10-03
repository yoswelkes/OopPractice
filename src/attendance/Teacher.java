package attendance;

public class Teacher implements Person {
    private String name;
    private int teacherID;
    private String subject;

    public Teacher(String name, int teacherID, String subject) {
        this.name = name;
        this.teacherID = teacherID;
        this.subject = subject;
    }

    @Override
    public String getAttendanceString() {
        return "Teacher " + name + " (ID: " + teacherID + ")";
    }

    // Getters and toString method for testing
    public String getName() {
        return name;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", teacherID=" + teacherID +
                ", subject='" + subject + '\'' +
                '}';
    }
}
