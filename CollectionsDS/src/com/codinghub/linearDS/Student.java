package com.codinghub.linearDS;

import java.util.*;

public class Student {

	public static void main(String[] args) 
	{
		Stu s1=new Stu();
		s1.setName("Mahesh");s1.setPercent(100);s1.setRoll(69);
		Stu s2=new Stu();
		s2.setName("Paul");s2.setPercent(85);s2.setRoll(175);
		Stu s3=new Stu();
		s3.setName("Bob");s3.setPercent(232);s3.setRoll(20);
		List<Stu> al=new ArrayList<>();
		al.add(s1);al.add(s2);al.add(s3);
		Collections.sort(al,new sortpeace());
		System.out.println(al);
	}
}
class Stu
{
	String name;int roll;int percent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", roll=" + roll + ", percent=" + percent + "]";
	}
}
class sortpeace implements Comparator<Stu>
{

	@Override
	public int compare(Stu o1, Stu o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.percent, o1.percent);
	}
	
}