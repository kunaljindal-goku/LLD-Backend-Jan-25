package query;

public class NoSqlQuery implements Query{
    @Override
    public void execute() {
        System.out.println("NoSql query is getting executed in MongoDb");
    }
}
