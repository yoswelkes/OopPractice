package attendance;
import java.util.List;

public interface Class {
    void takeAttendance(Person person);
    List<String> getAttendanceList();
}
