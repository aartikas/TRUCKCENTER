import java.util.*;
public class truckthread extends Thread {


private int ide;
private int axles;
private int weight;
private int assigntoll=0;
private int tollamout=0;
tollboth4 tb1,tb2,tb3,tb4;

public truckthread(int ide,int axles,int weight,tollboth4 tb1,tollboth4 tb2,tollboth4 tb3,tollboth4 tb4)
{
this.ide=ide;
this.axles=axles;
this.weight=weight;
this.tb1=tb1;
this.tb2=tb2;
this.tb3=tb3;
this.tb4=tb4;
this.tollamout=this.axles*5+this.weight*20;
}



public void run()
{
	Random r= new Random();
	int slep=r.nextInt(500);
	try {
		sleep(slep);
		assigntoll=r.nextInt(4)+1;
		
		if(assigntoll==1 )
		{	
			while(tb1.available!=true)
			{
				sleep(1000);
			}
		
			tb1.available=false;
			//getTollamout();
			System.out.println("toll number :1 "+"truck id"+getId()+"truck weight"+getWeight()+"truck axles"+getAxles()+"toll amount"+tollamout);
			//tollamout=getWeight()*20+getAxles()*50;
			tb1.setCashdrawers( tollamout,false);
			
			//tb1.setcashdrawers(x);
			tb1.updatecount();
			tb1.available=true;
			
		}
		if(assigntoll==2 )
		{	
			while(tb2.available!=true)
			{
				sleep(1000);
			}
		
			tb2.available=false;
			//getTollamout();
			System.out.println("toll number :2 "+"truck id"+getId()+"truck weight"+getWeight()+"truck axles"+getAxles()+"toll amount"+tollamout);
			//tollamout=getWeight()*20+getAxles()*50;
			tb2.setCashdrawers( tollamout,false);
			
			//tb1.setcashdrawers(x);
			tb2.updatecount();
			tb2.available=true;
			
		}
		if(assigntoll==3 )
		{	
			while(tb3.available!=true)
			{
				sleep(1000);
			}
		
			tb3.available=false;
			//getTollamout();
			System.out.println("toll number :3 "+"truck id"+getId()+"truck weight"+getWeight()+"truck axles"+getAxles()+"toll amount"+tollamout);
			//tollamout=getWeight()*20+getAxles()*50;
			tb3.setCashdrawers( tollamout,false);
			
			//tb1.setcashdrawers(x);
			tb3.updatecount();
			tb3.available=true;
			
		}
		if(assigntoll==4 )
		{	
			while(tb4.available!=true)
			{
				sleep(1000);
			}
		
			tb4.available=false;
			//getTollamout();
			System.out.println("toll number :4 "+"truck id"+getId()+"truck weight"+getWeight()+"truck axles"+getAxles()+"toll amount"+tollamout);
			//tollamout=getWeight()*20+getAxles()*50;
			tb4.setCashdrawers( tollamout,false);
			
			//tb1.setcashdrawers(x);
			tb4.updatecount();
			tb4.available=true;
			
		}
		/*if(assigntoll==2)
		{	while(tb2.available==false)
		{
			sleep(1000);
		}
			tb2.available=false;
			getTollamout();
			System.out.println("toll number :2 "+"truck id"+getId()+"truck weight"+getWeight()+"truck axles"+getAxles()+"toll amount"+getTollamout());
			tb2.setcashdrawers(getTollamout());
			tb2.updatecount();
			tb2.available=true;
			
		}
		
		/* if(assigntoll==2 &&tb2.available==true)
		{
			tb2.available=false;
			getTollamout();
			
			tb2.setcashdrawers(getTollamout());
			tb2.available=true;
			
		}
		
		 if(assigntoll==3)
		{
			 while(tb3.available==false)
				{
					sleep(1000);
				}
			tb3.available=false;
			getTollamout();
			System.out.println("toll number :3"+"truck id"+getId()+"truck weight"+getWeight()+"truck axles"+getAxles()+"toll amount"+getTollamout());
			
			tb3.setcashdrawers(getTollamout());
			tb3.updatecount();
			tb3.available=true;
			
		}
		
		 

		 if(assigntoll==4)
		{
		while(tb4.available==false)
		{
			sleep(1000);
		}
			tb4.available=false;
			getTollamout();
			System.out.println("toll number :4 "+"truck id"+getId()+"truck weight"+getWeight()+"truck axles"+getAxles()+"toll amount"+getTollamout());
			
			tb4.setcashdrawers(getTollamout());
			tb4.updatecount();
			tb4.available=true;
			
		}
		
		
	*/
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
	//System.out.println(getIde()+getAxles()+getWeight());
	


}


public int getIde() {
	return ide;
}

public int getAxles() {
	return axles;
}





public int getWeight() {
	return weight;
}

public int getAssignedTOll() {
	return assigntoll;
}






/*public int getTollamout() {
	tollamout+=getWeight()*20+5*getAxles();
	//System.out.println("amount is"+getWeight()+"getAxles"+getAxles()+"get amt"+tollamout);
	
	return tollamout;
}
*/





}
