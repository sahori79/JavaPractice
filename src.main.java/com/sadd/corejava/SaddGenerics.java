package com.sadd.corejava;

import java.util.ArrayList;
import java.util.List;

//What is the benefit of using Java generics?
//Early error detection at compile time. Generic offers type safety for type casting issues

public class SaddGenerics {

	public static void main(String[] args) {
		
		
		String[] s = new String[5];
		s[0]="sadd";
		s[1]=1;  // Array is type safe
		
		List al= new ArrayList(); // not a type safe ArrayList, will have problem at runtime
		al.add("sadd"); 
		al.add(1);
		
		String s1= (String) al.get(0);
		String s2= (String) al.get(1);// this will throw runtime exception
		
		List<String> al1= new ArrayList<String>(); 
		al1.add("sadd"); 
		al1.add(1); // already showing problem, so early detected
	}

}
