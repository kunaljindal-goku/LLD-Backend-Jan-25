package db;

import factory.DatabaseFactory;
import factory.MongoDbFactory;
import query.NoSqlQuery;
import query.Query;
import transactions.NoSqlTransaction;
import transactions.Transaction;

public class MongoDb extends Database {

    @Override
    public DatabaseFactory createDatabasefactory() {
        return new MongoDbFactory();
    }
}
