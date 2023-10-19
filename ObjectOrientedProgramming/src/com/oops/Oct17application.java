package com.oops;
public class Oct17application 
{
	public static void main(String[] args) 
	{
		Student st2=new Student(567.0,600.0,'c',12,"Deepak");
		st2.print1();
	}
}
class Student
{
	String name;
	int rollno;
	char sec;
	double obtained_marks,total_marks,percentage;
	Student(double a,double b,char c,int rn,String n)
	{
		name=n;
		obtained_marks=a;total_marks=b;
		percentage=(obtained_marks/total_marks)*100;
		sec=c;
		rollno=rn;
	}
	void print1()
	{
		System.out.println("Name        : " +name);
		System.out.println("Roll no.    : "+rollno);
		System.out.println("Section     : "+sec);
		System.out.println("Percentage  : "+percentage);
	}
}