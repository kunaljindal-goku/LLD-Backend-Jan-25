import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;
import java.awt.image.BufferedImageOp;
import java.lang.reflect.WildcardType;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getHelper()
                .setName("ABC")
                .setUniversity("NIT Allahabad")
                .setAge(23)
                .build();

//        Student s = new Student(new Builder());
    }
}
