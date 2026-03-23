package factory;

import query.Query;
import query.SqlQuery;
import transactions.MySqlTransaction;
import transactions.Transaction;

public class MySqlFactory implements DatabaseFactory{
    @Override
    public Query getQuery() {
        return new SqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MySqlTransaction();
    }
}
