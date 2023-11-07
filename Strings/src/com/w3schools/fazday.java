package com.w3schools;

public class fazday {

	public static void main(String[] args) {
		String s="!!day--yaz!!";
		String s1[]=s.split("");
		int count=0;
		  for(int x=1;x<s1.length;x++){
		    if((s1[x].charAt(0)<'a'||s1[x].charAt(0)>'z')&&(s1[x].charAt(0)>'Z'||s1[x].charAt(0)<'A')){
		      if(s1[x-1].equalsIgnoreCase("y") || s1[x-1].equalsIgnoreCase("z")){
		        count++;
		      }
		    }
		  }
		  if(s1[s1.length-1].equalsIgnoreCase("y") || s1[s1.length-1].equalsIgnoreCase("z")){
		    count++;
		  }
		System.out.println(count);
	}

}
