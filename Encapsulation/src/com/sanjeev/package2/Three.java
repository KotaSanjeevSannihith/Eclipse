package com.sanjeev.package2;
import com.sanjeev.package1.*;
public class Three 
{
	public static void main(String args[])
	{
		SetterGetters sg=new SetterGetters();
		sg.setCity("Bengaluru");
		sg.setName("Sanjeev Sannihith Kota");
		sg.setRollno(21);
		sg.setSec("C");
		System.out.println(sg.getName()+"\n"+sg.getRollno()+"\n"+sg.getSec()+"\n"+sg.getCity());
	}
}