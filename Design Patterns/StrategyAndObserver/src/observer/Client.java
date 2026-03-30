package observer;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Client {

    public static void main(String[] args) {
        Observer iphoneScreen = new IphoneScreen();
        Observer macScreen = new MacScreen();

        WeatherService weatherService = new WeatherService(43.4);
        weatherService.addObeserver(iphoneScreen);
        weatherService.addObeserver(macScreen);

        weatherService.changeTemp(56.7);

        weatherService.removeObserver(iphoneScreen);

        System.out.println("***** After removing Iphone as observer");
        weatherService.changeTemp(98);
    }
}
