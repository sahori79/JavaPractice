package com.sadd.corejava.collection.sort.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyArrayListSorterWithCustom {
    
    public static void main(String[] args){
    
    List<Double> testDoubleList=createDoubleList();
    System.out.println("Before testDoubleList Sort: " + testDoubleList.toString());
    Collections.sort(testDoubleList);
    System.out.println("after testDoubleList Sort: " + testDoubleList.toString());
    
    
    List<String> testStringList=createStringList();
    
    System.out.println("Before testStringList Sort: " + testStringList.toString());
    Collections.sort(testStringList);
    System.out.println("after testStringList Sort: " + testStringList.toString());
        
    }

    private static List<String> createStringList() {
    List<String> testList=new ArrayList<String>();

    testList.add("b");
    testList.add("a");
    testList.add("f");
    testList.add("c");
    testList.add("d");
    testList.add("e");
    testList.add("g");
    testList.add("h");
    testList.add("i");
    testList.add("k");
    testList.add("z");
    testList.add("j");
    testList.add(".");
    testList.add("*");
    
    return testList;
    
    }

    private static List<Double> createDoubleList() {
    List<Double> testList=new ArrayList<Double>();
    testList.add(0.2);
    testList.add(0.9);
    testList.add(0.1);
    testList.add(0.1);
    testList.add(0.1);
    testList.add(0.54);
    testList.add(0.71);
    testList.add(0.71);
    testList.add(0.71);
    testList.add(0.92);
    testList.add(0.12);
    testList.add(0.65);
    testList.add(0.34);
    testList.add(0.62);
    
    return testList;
    
    }
   

}
