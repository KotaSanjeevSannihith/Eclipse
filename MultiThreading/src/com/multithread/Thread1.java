package com.multithread;

public class Thread1 
{
	public static void main(String args[])
	{
		A a=new A();
		Thread t1=new Thread(a,"Thread 1");
		t1.start();
		for(int x=0;x<10;x++)
		{
			System.out.println("Main Thread");
		}
	}
}
class A extends Thread
{
	public void run()
	{
		m1();
	}
	public synchronized void m1()
	{
		for(int x=0;x<10;x++)
		{
			System.out.println("Thread 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
