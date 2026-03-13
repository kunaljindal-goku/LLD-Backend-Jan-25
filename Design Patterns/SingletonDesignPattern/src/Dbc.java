import java.util.List;

class Dbc {

    String url;
    String userName;
    String password;
    List<Dbc> pool;

    private static final Dbc instance = new Dbc();  // eager loading

    private Dbc() {
    }

    public static Dbc getInstance() {
        return instance;
    }
}
