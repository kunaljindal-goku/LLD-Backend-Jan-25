package transactions;

public class NoSqlTransaction implements Transaction{
    @Override
    public void commit() {
        System.out.println("This is a NoSql Transaction");
    }
}
