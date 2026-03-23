import db.Database;
import db.MongoDb;
import db.MySql;
import query.NoSqlQuery;
import query.Query;
import query.SqlQuery;

import javax.xml.crypto.Data;

public class UserService {

    Database db;

    public UserService(Database db) {
        this.db = db;
    }

    public void createUser() {
        Query q = null;
        if(db instanceof MySql) {
            q = new SqlQuery();
        }
        else if(db instanceof MongoDb) {
            q = new NoSqlQuery();
        }
        q.execute();
    }
}
