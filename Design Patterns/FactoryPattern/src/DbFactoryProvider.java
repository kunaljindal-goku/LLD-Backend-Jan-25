import db.Database;
import db.MongoDb;
import db.MySql;

import javax.xml.crypto.Data;

public class DbFactoryProvider {

    public static Database createDatabase(String dbName) {
        if(dbName.equals("mongo")) {
            return new MongoDb();
        }
        else if(dbName.equalsIgnoreCase("mysql")) {
            return new MySql();
        }
        else if(dbName.equalsIgnoreCase("cassandra"))
        return null;
    }
}
