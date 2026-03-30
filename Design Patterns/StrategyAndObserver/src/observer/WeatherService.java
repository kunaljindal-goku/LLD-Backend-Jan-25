package observer;

import javax.management.ObjectName;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class WeatherService {

    private List<Observer> observers;
    private double temp;

    public WeatherService(double temp) {
        this.observers = new ArrayList<>();
        System.out.println("Initial temp: "+temp);
        this.temp = temp;
    }

    public void addObeserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void changeTemp(double newTemp) {
        this.temp = newTemp;
        System.out.println("Temp changed to: "+newTemp);
        // notidfy all consumer
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for(Observer observer: observers) {
            observer.updateScreen(this.temp);
        }
    }

//    public void updateStockPrice(int newPrice) {
//        this.price = newPrice;
//
//        if(newPrice < 70) notifyAllObservers();;
//    }


}
