import db.Database;
import db.MongoDb;
import db.MySql;

public class Client {

    public static void main(String[] args) {
       // String dbName = config.getName();

        Database db = DbFactoryProvider.createDatabase("mongo");
        UserService userService = new UserService(db);



       // userService.createUser();
        userService.executeUserTransaction();
    }
}
