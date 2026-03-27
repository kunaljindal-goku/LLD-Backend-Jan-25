public class FarmHouse implements Pizza{
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public void getDescription() {
        System.out.println("This is veggie loaded farmhouse pizza");
    }
}
