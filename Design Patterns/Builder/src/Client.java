import javax.swing.text.html.HTMLEditorKit;

public class Client {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.setName("ABC");
        helper.setAge(23);
        helper.setUniversity("NIT Allahabad");

        Student s = new Student(helper);
    }
}
