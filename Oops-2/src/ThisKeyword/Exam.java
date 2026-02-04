package ThisKeyword;

import java.util.PriorityQueue;

public class Exam {

    int examId;

    String examName;

    public Exam() {
    }

    public Exam(Exam other) {
        this.examId = other.examId;
        this.examName = other.examName;
    }

    public Exam(int examId, String examName) {
        this.examId = examId;
        this.examName = examName;
    }

    public int getExamId() {
        return examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }
}
