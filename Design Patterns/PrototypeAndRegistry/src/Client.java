import java.util.concurrent.atomic.AtomicBoolean;

public class Client {

    //        if(avenger instanceof Avenger) {
//            newAvenger = new Avenger(avenger);
//        }
//        else if(avenger instanceof IronMan) {
//            newAvenger = new IronMan((IronMan) avenger);
//        }
//        else if(avenger instanceof Thor) {
//            newAvenger = new Thor((Thor) avenger);
//        }


    public static void saveEarth(Avenger avenger) {
        Avenger newAvenger = avenger.clone();
        System.out.println("Metho call: "+newAvenger.name);
    }

    public static void main(String[] args) {

//        Avenger avenger = new Avenger("Base Avenger",90,50);
        //saveEarth(avenger);

//        IronMan ironMan = new IronMan("Tony", 45, 99, "Hey Jarvis");
//        saveEarth(ironMan);
//
//        Thor thor = new Thor("Thor", 45, 99, 100);
//        saveEarth(thor);
//
//        IronMan i2 = ironMan.clone();
//        System.out.println(i2.jarvis);

        StudentRegistry studentRegistry = new StudentRegistry();
        Student april26Student = new Student("April_26", "ABC");
        Student may26Student = new Student("May_26", "XYZ");
        studentRegistry.putEntry("April_26", april26Student);
        studentRegistry.putEntry("May_26", may26Student);

        Student archit = studentRegistry.getStudent("April_26").clone();
        archit.setName("Archit");
        archit.setAge(24);
        archit.setPsp(90);

        Student manvendra = studentRegistry.getStudent("April_26").clone();
        manvendra.setName("Manvendra");
        manvendra.setAge(20);
        manvendra.setPsp(88);

        Student praful = studentRegistry.getStudent("May_26").clone();
        praful.setName("Praful");
        praful.setAge(20);
        praful.setPsp(90);






    }
}
