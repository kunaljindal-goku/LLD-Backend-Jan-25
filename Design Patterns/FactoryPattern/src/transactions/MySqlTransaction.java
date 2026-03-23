package transactions;

public class MySqlTransaction implements Transaction{
    @Override
    public void commit() {
        System.out.println("This is a MYSQL transaction");
    }
}
