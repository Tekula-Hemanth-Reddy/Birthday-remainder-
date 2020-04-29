package BirthdayRemainder;

import java.util.*;

public class Notific extends Observable {

	public void check(int m,int d) {
		if(m==2 && d==6)
		{
			send("hemanth");
		}
		if(m==11 && d==4)
		{
			send("sathvik");
		}
		if(m==11 && d==8)
		{
			send("Uthej");
		}
		if(m==7 && d==20)
		{
			send("Butterfly");
		}
		if(m==7 && d==30)
		{
			send("Aditya");
		}
		if(m==11 && d==2)
		{
			send("Kittu");
		}
		if(m==9 && d==23)
		{
			send("Sai");
		}
		if(m==0 && d==17)
		{
			send("Duffer");
		}
		if(m==2 && d==30)
		{
			send("varsha");
		}
		if(m==10 && d==2)
		{
			send("bash");
		}
		if(m==1 && d==18)
		{
			send("ashrith");
		}
		if(m==8 && d==20)
		{
			send("56");
		}
		if(m==0 && d==3 )
		{
			send("supii");
		}
		if(m==7 &&d==5)
		{
			send("discount sale");
		}
		if(m==0 && d==30)
		{
			send("yashu && koti");
		}
		if(m==8 && d==13)
		{
			send("chandhu");
		}
		if(m==10 && d==11)
		{
			send("chitti");
		}
		if(m==11&& d==14)
		{
			send("vishnu");
		}
		if(m==11&&d==11)
		{
			send("staticrao");
		}
	}

	private void send(String str) {
		setChanged();
		notifyObservers(str);
		
	}

	
}
