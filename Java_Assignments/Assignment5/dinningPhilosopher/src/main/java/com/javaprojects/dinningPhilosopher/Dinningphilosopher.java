package com.javaprojects.dinningPhilosopher;
import java.io.IOException;

public class Dinningphilosopher
{
    public static void main(String args[])throws IOException
    {
        
        Fork f[]=new Fork[5];
        for(int i=0;i<5;i++)
        {
        	f[i]=new Fork();
        }
        Philosopher p=new Philosopher(1,"Riya",f[0],f[1]);
        Thread t=new Thread(p);
        t.start();
        Philosopher p1=new Philosopher(2,"Ketan",f[1],f[2]);
        Thread t1=new Thread(p1);
        t1.start();
        Philosopher p2=new Philosopher(3,"Divya",f[2],f[3]);
        Thread t2=new Thread(p2);
        t2.start();
        Philosopher p3=new Philosopher(4,"Umar",f[3],f[4]);
        Thread t3=new Thread(p3);
        t3.start();
        Philosopher p4=new Philosopher(5,"Tanvi",f[4],f[0]);  
        Thread t4=new Thread(p4);
        t4.start();
    }
            
}
class Philosopher extends Thread
{
	private int p_id;
	private Fork f_left;
	private Fork f_right;
	private String name;
	Philosopher(int id,String p_name,Fork left,Fork right)
	{
		this.p_id=id;
		this.f_left=left;
		this.f_right=right;
		this.name=p_name;
	}
    public void run()
    {
    	while(true)
    	{
    		try 
    		{
				this.havingFood();
				sleep(1000);
				this.waitingForFood();
				sleep(1000);
			} 
    		catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
    		
    	}
    }
    synchronized public void havingFood() throws InterruptedException
    {
    	if(this.f_left.f_status==false && this.f_right.f_status==false)
    		{
    			this.f_left.f_status=true;
    			this.f_right.f_status=true;
    			System.out.println(this.p_id+" "+this.name+" is eating");
    			
    			wait(1000);
				
    			System.out.println(this.p_id+" "+this.name+"done eating");
    			this.f_left.f_status=false;
    			this.f_right.f_status=false;
			}
			
	}
    	
   synchronized public void waitingForFood()
   {
    	System.out.println(this.p_id+" "+this.name+" is thinking");
		notify();
    
   }
}
class Fork
{
	int fork_id;
	boolean f_status;
	
	Fork()
	{
		this.f_status=false;
	}
	
}