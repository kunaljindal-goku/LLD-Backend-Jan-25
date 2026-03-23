package db;

import factory.DatabaseFactory;
import factory.MySqlFactory;
import query.Query;
import query.SqlQuery;
import transactions.MySqlTransaction;
import transactions.Transaction;

public class MySql extends Database {


    @Override
    public DatabaseFactory createDatabasefactory() {
        return new MySqlFactory();
    }
}
