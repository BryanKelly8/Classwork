
public class clock {
//instance variables
	private int hr;
	private int min;
	private int sec;
	
//constructor must be called the same as the class
//constructor method(overloaded)
	public clock()
	{
		hr=0;
		min=0;
		sec=0;
	}
	
	public clock(int hours, int minutes, int seconds)
	{
		hr=hours;
		min=minutes;
		sec=seconds;
	}
	
	//setter or mutator methods
	public void setHour(int hours)
	{
		hr=hours;
	}
	
	//getter or accessor methods
	public int getHour()
	{
		return hr;
	}
	
	
	
	//regular methods
	public void setTime(int hours, int minutes, int seconds)
	{
		if(hours>=0 && hours<24)
			this.hr=hours;
		else
			this.hr=0;
		if (minutes>=0 && seconds<60)
			this.min=minutes;
		else
			this.min=0;
		if(seconds>=0 && seconds<60)
			this.sec=seconds;
		else
			this.sec=0;
		hr=hours;
		min=minutes;
		sec=seconds;
	
	}
	
	public void incrementHours()
	{
		hr++;
		if (hr>23)
			hr=0;
	}
	public void incrementMinutes()
	{
		min++;
		if (min>59)
			min=0;
			incrementHours();
	}
	
	public void printTime()
	{
		System.out.print("\n");
		if (hr<10)
			System.out.print(0);
		System.out.print(hr);
		System.out.print(":");
		if (min<10)
			System.out.print(0);
		System.out.print(min);
		System.out.print(":");
		if (sec<10)
			System.out.print(0);
		System.out.print(sec);
		System.out.print(":");
	}
	
	//to string: override
	public String toString()
	{
		String pClock="hour: ";
		if(hr<10)
			pClock+="0";
		pClock+=""+hr+"\nminute";
		if(min<10)
			pClock+="0";
		pClock+=""+min+"\nsecond";
		if(sec<10)
			pClock+="0";
		pClock+=""+sec+"\n";
		return pClock;
	}
}
