package com.sanjeev.polymorphism2;

import com.sanjeev.polymorphism1.One;

public class Two {

	public static void main(String[] args) {
		One one=new One();
		one.isOne();
		one.isOne(30,40);
		one.isOne('a', 20);
		one.isOne(50,'b');
	}

}
