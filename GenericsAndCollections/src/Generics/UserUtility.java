package Generics;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class UserUtility<T> {

    public void printName(ScalerUser u) {
        System.out.println(u.name);
    }

    // T can be anything -> List<Integer> int wont' have name
    // ScalerUser and its child classes
    public void printNames(List<? extends ScalerUser> users) {
        for(ScalerUser user: users) {
            System.out.println(user.name);
        }
    }

//    public <T extends ScalerUser>void printNames(List<T> users) {
//
//    }

    Collection;
    Map
}
