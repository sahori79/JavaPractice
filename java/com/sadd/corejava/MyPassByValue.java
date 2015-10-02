package com.sadd.corejava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyPassByValue {
    
    public static void main(String[] args){
    
    StringBuffer a= new StringBuffer("A");
    StringBuffer b= new StringBuffer("B");
    methoda(a,b);
    System.out.println(a+ ","+b);
    
    
    String c=new String("A");
    String d= new String("B");
    methodb(c,d);
    System.out.println(c+ ","+d);
    
    
    HashMap<Integer,String> myMap1=new HashMap<Integer,String>();
    HashMap<Integer,String> myMap2 = new HashMap<Integer,String>();
    myMap1.put(new Integer(1), new String("A"));
    myMap2.put(new Integer(2), new String("B"));
    methodc(myMap1,myMap2);
    System.out.println(myMap1.get(1)+ ","+  myMap2.get(2));


}

    static void methoda(StringBuffer x, StringBuffer y){
    x=x.append(y);
    y=x;
    }
    static void methodb(String x, String y){
    x=x+y;
    y=x;
    }
    static void methodc(HashMap x, HashMap y){
    
    //List val=(List) x.values();
    //x=x+y;
    y=x;
    }


}