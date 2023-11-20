package com.codinghub.linearDS;

import java.util.ArrayList;
import java.util.List;

public class UDgeneric 
{
	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		emp1.setName("Ram");emp1.setID(1186);
		Employee emp2=new Employee();
		emp2.setName("Mahesh");emp2.setID(272);
		Employee emp3=new Employee();
		emp3.setName("Arjun");emp3.setID(390);
		List<Employee> al=new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		System.out.println(al);
	}
}
class Employee
{
	String name;
	int ID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ID=" + ID + "]";
	}
	
}