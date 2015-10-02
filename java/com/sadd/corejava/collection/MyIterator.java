package com.sadd.corejava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterator {

    
    public static void main(String[] args){
    
    List<String> testDoubleList=createStringList();
    
 // or Iterator<Double> it = testList.iterator(); while (it.hasNext()){ .....   }
     for (Iterator<String> it = testDoubleList.iterator(); it.hasNext();){
         
         System.out.println(it.next());
     }
    
    
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
}
