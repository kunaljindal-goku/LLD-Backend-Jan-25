import java.time.chrono.IsoChronology;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultithreadedDbc {

    String url;
    String userName;
    String password;
    List<Dbc> pool;

    private static MultithreadedDbc instance;
    private static final Lock lock = new ReentrantLock();


    private MultithreadedDbc() {
    }

    public static MultithreadedDbc createInstance() {
        if (instance == null) {
            synchronized (MultithreadedDbc.class) {
                if (instance == null) {
                    instance = new MultithreadedDbc();
                }
            }
        }
        return instance;
    }
}
