package com.sadd.corejava.collection.sort;

import java.util.Arrays;
import java.util.HashMap;

public class MyHashMapSorter {

	public static void main(String[] args) {

		HashMap<Float,String> myHashMap = new HashMap<Float, String>();
		myHashMap.put(2.38f,"sadd");
		myHashMap.put(2.5f,"riad");
		Float[] myArray = (Float[]) myHashMap.keySet().toArray();
		Arrays.sort(myArray);
	}

}
