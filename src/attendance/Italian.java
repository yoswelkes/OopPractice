package attendance;

import java.util.ArrayList;
import java.util.List;

public class Italian implements Class {
    private List<String> attendanceList;

    public Italian() {
        this.attendanceList = new ArrayList<>();
    }

    @Override
    public void takeAttendance(String studentName) {
        attendanceList.add(studentName);
        System.out.println(studentName + " is present in Italian class.");
    }

    @Override
    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

