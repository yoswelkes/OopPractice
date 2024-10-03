package attendance;

import java.util.ArrayList;
import java.util.List;

public class Math implements Class {
    private List<String> attendanceList;

    public Math() {
        this.attendanceList = new ArrayList<>();
    }

    @Override
    public void takeAttendance(String studentName) {
        attendanceList.add(studentName);
        System.out.println(studentName + " is present in Math class.");
    }

    @Override
    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

