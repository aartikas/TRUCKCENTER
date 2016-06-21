import java.util.Random;

public class mains {
	public static void main(String args[])
	   {
			int tgate = 0;
			int w,a,id;
	     // tollbooth cnt = new tollbooth();
	      //System.out.println("starting counter 1");
	     // Thread cnt=new Thread("booth1");
	     // cnt.start();
			tollboth4 tt1=new tollboth4(1,true);
			tollboth4 tt2=new tollboth4(2,true);
			tollboth4 tt3=new tollboth4(3,true);
			tollboth4 tt4=new tollboth4(1,true);
			Random r=new Random();
		
		
			
		truckthread[] t1=new truckthread[15];
		for(int i=0;i<15;i++)
		{	w=r.nextInt(5)+1;
			id=r.nextInt(88)+11;
			a=r.nextInt(5)+2;
		
		 t1[i]=new truckthread(id,a,w, tt1,tt2,tt3,tt4);
		  t1[i].start();
		}
		collection_center c=new collection_center(tt1, tt2, tt3, tt4);
		c.start();
		
		for(int i=0;i<15;i++)
		{
			try {
				t1[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		c.shutdown();
		try {
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*System.out.println("***************end of day collection***************");
		System.out.println("toll both 1:  amount collected "+c.gettotal1());
		System.out.println("toll both 2:  amount collected "+c.gettotal2());
		System.out.println("toll both 3:  amount collected "+c.gettotal3());
		System.out.println("toll both 4:  amount collected "+c.gettotal4());
		//System.out.println("tt1 cashdrawer"+tt1.getcashdrawer()+"tt1 count"+tt1.updatecount());
		//System.out.println("tt2 cashdrawer"+tt2.getcashdrawer()+"tt2 count"+tt2.updatecount());
		//System.out.println("tt3 cashdrawer"+tt3.getcashdrawer()+"tt3 count"+tt3.updatecount());
		//System.out.println("tt4 cashdrawer"+tt4.getcashdrawer()+"tt4 count"+tt4.updatecount());
		
			//t1.start();
			//t2.start();
			/*do{
			if(t1.getAssignedTOll()!=0)
			{
				tgate=t1.getAssignedTOll();
				System.out.println("t is assigned "+tgate);
			}
			if(t2.getAssignedTOll()!=0)
			{
				tgate=t2.getAssignedTOll();
				System.out.println("t2 is assigned"+tgate);
			}
			
			
			
			if(tgate==tt1.tollbothnumber)
			{
				tt1.available=false;
				tt1.setcashdrawers(t1.getTollamout());
				System.out.println("t1 cashfrawer"+tt1.getcashdrawer());
				tt1.available=true;
			}
			if(tgate==tt2.tollbothnumber)
			{
				tt2.available=false;
				tt2.setcashdrawers(t1.getTollamout());
				System.out.println("t2 cashdrawer"+tt2.getcashdrawer());
				tt2.available=true;
			}
			if(tgate==tt3.tollbothnumber)
			{
				tt3.available=false;
				tt3.setcashdrawers(t1.getTollamout());
				System.out.println("t3 cashdrawer"+tt3.getcashdrawer());
				tt3.available=false;
			}
			if(tgate==tt4.tollbothnumber)
			{
				tt4.available=false;
				tt4.setcashdrawers(t1.getTollamout());
				//System.out.println("Tollnumber:"+getName()+"Truck number"+i+"Axles:"+t[i].getAxles()+"Weight:"+t[i].getWeight()+"Amount"+t[i].getTollamout()+"amount uptillnow:"+collectedamt (t[i].getTollamout()));
				System.out.println("t4.cashdrawer"+tt4.getcashdrawer());
				tt4.available=true;
			}
			}
			while(t1.isAlive()||t2.isAlive());
			//System.out.println("in main");
	    //  System.out.println("starting counter 2");
	     // cnt2.start();
	      //tollbooth cnt3 = new tollbooth();
	      //System.out.println("starting counter 3");
	      //cnt3.start();
	     */
}
}
