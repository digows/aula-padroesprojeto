package br.edu.udc.es.dp.test;
import java.util.Observable;
import java.util.Observer;

import br.edu.udc.es.dp.observer.LocalChat;

public class ObserverTests {
	
    public static void main(String[] args) {
        System.out.println("Digite uma mensagem: ");
        
        final LocalChat localChat = new LocalChat();
        
        localChat.addObserver( new Observer() {
            public void update(Observable owner, Object mensagem) {
                System.out.println("Recebeu a mensagem: " + mensagem );
            }
        });

        new Thread(localChat).start();
    }
}