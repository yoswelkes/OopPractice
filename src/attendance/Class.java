package attendance;
import java.util.List;

public interface Class {
    void takeAttendance(String studentName);
    List<String> getAttendanceList();
}
