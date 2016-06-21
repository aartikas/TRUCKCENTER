
public class collection_center extends Thread {

	tollboth4 tb1,tb2,tb3,tb4;
	private int tot1=0;
	 private int tot2=0;
	 private int tot3=0;
	 private int tot4=0;
	boolean one=true;
	
	void shutdown()
	{	
		one=false;
	}
	public collection_center(tollboth4 tb1,tollboth4 tb2,tollboth4 tb3,tollboth4 tb4)
	{
		this.tb1=tb1;
		this.tb2=tb2;
		this.tb3=tb3;
		this.tb4=tb4;
	}
	
	public int gettotal1()
	{
		return tot1;
	}
	public int gettotal2()
	{
		return tot2;
	}
	public int gettotal3()
	{
		return tot3;
	}
	public int gettotal4()
	{
		return tot4;
	}
	public void run()
	{
		while(one)
		{
		try {
		
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tb1.available==true )
			tb1.available=false; 
		if(tb2.available=true)
			tb2.available=false;
		if(tb3.available=true)
			tb3.available=false;
		if(tb4.available=true)
			tb4.available=false;
			
		while(tb1.available==false && tb2.available==false &&tb3.available==false&&tb4.available==false)	
		{
			System.out.println("*** emptying cash drawer ***");
			System.out.println("Tollbooth number 1   "+"total since last collection"+tb1.getcashdrawer()+"total truck count"+tb1.getcount());
			System.out.println("Tollbooth number 2   "+"total since last collection"+tb2.getcashdrawer()+"total truck count"+tb2.getcount());
			System.out.println("Tollbooth number 3   "+"total since last collection"+tb3.getcashdrawer()+"total truck count"+tb3.getcount());
			System.out.println("Tollbooth number 4   "+"total since last collection"+tb4.getcashdrawer()+"total truck count"+tb4.getcount());
		tot1+=tb1.getcashdrawer();
		tot2+=tb2.getcashdrawer();
		tot3+=tb3.getcashdrawer();
		tot4+=tb4.getcashdrawer();
		
		tb1.setCashdrawers(0,true);
		tb2.setCashdrawers(0,true);
		tb3.setCashdrawers(0,true);
		tb4.setCashdrawers(0,true);
		
		tb1.available=true;
		tb2.available=true;
		tb3.available=true;
		tb4.available=true;
	
	}
		try {
			sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		System.out.println("***************end of day collection***************");
		System.out.println("toll both 1:  amount collected "+tot1);
		System.out.println("toll both 2:  amount collected "+tot2);
		System.out.println("toll both 3:  amount collected "+tot3);
		System.out.println("toll both 4:  amount collected "+tot4);
	
	}
	
}
