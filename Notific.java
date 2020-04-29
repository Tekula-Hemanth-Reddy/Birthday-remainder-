package BirthdayRemainder;

import java.util.*;

public class Notific extends Observable {

	public void check(int m,int d) {
		if(m==2 && d==6)
		{
			send("me");
		}
		
	}

	private void send(String str) {
		setChanged();
		notifyObservers(str);
		
	}

	
}
