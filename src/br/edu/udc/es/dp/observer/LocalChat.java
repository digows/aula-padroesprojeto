package br.edu.udc.es.dp.observer;
import java.util.Observable;
import java.util.Scanner;

public class LocalChat extends Observable implements Runnable {
	
    public void run() {
    	
        while (true) {
            final String response = new Scanner(System.in).next();
            super.setChanged();
            super.notifyObservers(response);
        }
    }
}