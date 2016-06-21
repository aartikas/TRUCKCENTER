
public class tollboth4 {
	private  int cashdrawers=0;
	int tollbothnumber;
	public volatile boolean available;
	 int truckcount=0;
	
	public tollboth4(int x,Boolean y)
	{
		this. tollbothnumber=x;
		this.available=true;
	}
	
	/*public synchronized int setcashdrawers(int m) {
		if(m!=0)
		{	System.out.println("cashdrawers"+getCashdrawers());
			System.out.println("passed maout"+m);
			//return cashdrawers+=m;
		}
		else
			return getCashdrawers()*0;
		return getCashdrawers();
	}*/
	
	public int getcashdrawer() {
		return cashdrawers;
	}
	public int getcount()
	{
		return truckcount;
	}
	public  int updatecount()
	{
		truckcount++;
		return truckcount;
	}

	
	public synchronized void setCashdrawers(int cash, boolean b) {
		if(b==false)
		this.cashdrawers+=cash;
		else
			this.cashdrawers=0;
	}


}
