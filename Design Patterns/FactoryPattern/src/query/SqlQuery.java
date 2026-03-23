package query;

public class SqlQuery implements Query{
    @Override
    public void execute() {
        System.out.println("SQL query is getting executed in MySQL");
    }
}
