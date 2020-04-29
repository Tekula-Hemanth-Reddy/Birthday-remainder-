package BirthdayRemainder;

import java.util.*;

public class remainder implements Runnable {
	Thread t;
	remainder()
	{
		t=new Thread(this,"hemanth");
		t.start();
	}

	public void run() {
		while(true) {
			Calendar cal=Calendar.getInstance();
			Message m=new Message();//observer
			Notific n=new Notific();//observable
			n.addObserver(m);
			n.check(cal.get(Calendar.MONTH),cal.get(Calendar.DATE));
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
