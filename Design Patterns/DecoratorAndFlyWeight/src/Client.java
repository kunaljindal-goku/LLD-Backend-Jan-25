public class Client {

    public static void main(String[] args) {
        Pizza p1 = new Margeritha();
        Pizza p2 = new FarmHouse();

//        System.out.println(p1.getCost());
//        System.out.println(p2.getCost());
//
//        p1.getDescription();
//        p2.getDescription();

//        p1 = new CheeseBurst(p1);
//        p1 = new Olive(p1);

        p1 = new Olive(new CheeseBurst(p1));
        p1 = new Olive(p1);
        System.out.println(p1.getCost());
        p1.getDescription();
    }
}
