package BirthdayRemainder;

import java.util.*;

public class Message implements Observer {

	
	public void update(Observable o, Object arg) {
		System.out.println("send happy birthday message to"+arg);
		new Ui((String) arg);
		
	}

}
