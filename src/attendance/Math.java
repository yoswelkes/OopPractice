package attendance;

import java.util.ArrayList;
import java.util.List;

public class Math implements Class {
    private List<String> attendanceList;

    public Math() {
        this.attendanceList = new ArrayList<>();
    }

    @Override
    public void takeAttendance(Person person) {
        String attendanceString = person.getAttendanceString();
        attendanceList.add(attendanceString);
        System.out.println(attendanceString + " is present in Math class.");
    }

    @Override
    public List<String> getAttendanceList() {
        return attendanceList;
    }
}
