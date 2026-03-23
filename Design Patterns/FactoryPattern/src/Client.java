import db.MongoDb;
import db.MySql;

public class Client {

    public static void main(String[] args) {


        UserService userService = new UserService(new MongoDb());



       // userService.createUser();
        userService.executeUserTransaction();
    }
}
