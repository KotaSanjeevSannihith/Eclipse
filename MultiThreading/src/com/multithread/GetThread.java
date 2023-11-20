package com.multithread;
public class GetThread {
	public static void main(String[] args) 
	{
		
		B b=new B();
		Thread thread1=new Thread(b);
		thread1.setName("Thread one");
		Thread thread2=new Thread(b);
		thread2.setName("Thread two");
	}
}
class B implements Runnable
{

	@Override
	public void run() 
	{
		for(int x=0;x<10;x++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}	
}