import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    Map<String, Student> studentRegistry;

    public StudentRegistry() {
        this.studentRegistry = new HashMap<>();
    }

    public void putEntry(String key, Student student) {
        studentRegistry.put(key,student);
    }

    public Student getStudent(String key) {
        return studentRegistry.get(key);
    }
}
