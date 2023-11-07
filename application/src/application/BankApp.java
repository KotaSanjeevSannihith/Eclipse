package application;

public class BankApp
{
	public static void main(String[] args) 
	{
		Bank1 b1=new Bank1();
		Bank2 b2=new Bank2();
		System.out.println("Bank B1");
		b1.balance();
		b1.maxDeposit();
		b1.maxTransaction();
		System.out.println();
		System.out.println("Bank B2");
		b2.balance();
		b2.maxDeposit();
		b2.maxTransaction();
	}
}
interface Bank
{
	void balance();
	void maxTransaction();
	void maxDeposit();
}
class Bank1 implements Bank
{
	@Override
	public void balance() 
	{
		System.out.println("Your Balance : 70000");
	}

	@Override
	public void maxTransaction() {
		System.out.println("Maximum Transaction : 15000");
	}

	@Override
	public void maxDeposit() 
	{
		System.out.println("Maximum Deposit : 30000");
	}	
}
class Bank2 implements Bank
{
	@Override
	public void balance() 
	{
		System.out.println("Your Balance : 20000");
	}

	@Override
	public void maxTransaction() {
		System.out.println("Maximum Transaction : 10000");
	}

	@Override
	public void maxDeposit() 
	{
		System.out.println("Maximum Deposit : 20000");
	}	
}