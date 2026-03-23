package factory;

import query.NoSqlQuery;
import query.Query;
import transactions.NoSqlTransaction;
import transactions.Transaction;

public class MongoDbFactory implements DatabaseFactory{
    @Override
    public Query getQuery() {
        return new NoSqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new NoSqlTransaction();
    }
}
