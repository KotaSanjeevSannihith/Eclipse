package com.multithread;

public class RunMethod 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		Thread t1=new Thread(d,"Thread 1");
		t1.start();
		for(int x=0;x<10;x++)
		{
			System.out.println("Main Thread");
		}
	}
}
class Demo implements Runnable
{
	@Override
	public void run() 
	{
		
	}
	public void m1()
	{
		for(int x=0;x<10;x++)
		{
			Thread.currentThread().yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
}