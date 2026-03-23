import db.Database;
import db.MongoDb;
import db.MySql;
import factory.DatabaseFactory;
import query.NoSqlQuery;
import query.Query;
import query.SqlQuery;
import transactions.Transaction;

import javax.xml.crypto.Data;

public class UserService {

    Database db;

    public UserService(Database db) {
        this.db = db;
    }

    public void createUser() {
        DatabaseFactory dbFactory = db.createDatabasefactory();
        Query q = dbFactory.getQuery();
        q.execute();
    }

    public void executeUserTransaction() {
        DatabaseFactory dbFactory = db.createDatabasefactory();
        Transaction t = dbFactory.createTransaction();
        t.commit();
    }
}
