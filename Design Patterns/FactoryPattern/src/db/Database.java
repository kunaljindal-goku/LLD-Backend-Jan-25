package db;

import factory.DatabaseFactory;
import query.Query;
import transactions.Transaction;

public abstract class Database {

    int connections;

    public int getPoolSize() {
        return 5;
    }

    public void connect() {
        System.out.println("Trying to create conection");
    }

    public abstract DatabaseFactory createDatabasefactory();
}
