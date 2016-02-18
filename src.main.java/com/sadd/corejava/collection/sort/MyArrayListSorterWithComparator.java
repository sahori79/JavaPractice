package com.sadd.corejava.collection.sort;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import com.sadd.corejava.collection.sort.Persion;

public class MyArrayListSorterWithComparator {
    
    public static void main(String[] args){
    
    List<Persion> testPersionList=createPersionList();
    
    Collections.sort(testPersionList, new Comparator<Persion>(){
    public int compare(Persion o1, Persion o2) {
        System.out.println("o1.getName() is " + o1.getName());
        System.out.println("o2.getName() is " + o2.getName());
        System.out.println("o1.getHeight()<o2.getHeight() "+ (o1.getHeight()<o2.getHeight()));
        
        //return (o1.getHeight() < o2.getHeight() ) ? 0: 1 ;   ====>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Did not work
        //return (o1.getHeight() > o2.getHeight() ) ? 0: 1 ;   ====>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Did not work  ... so > or < 0 does not work , has to be -1
        //return (o1.getHeight() > o2.getHeight() ) ? 1: -1 ;  ====>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Did not work, it reversed compared
        // return (o1.getHeight() < o2.getHeight() ) ? -1: 1 ; ====>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Did not work, it reversed compared
        return (o1.getHeight() > o2.getHeight() ) ? -1: 1 ;

        }}); 

     for(Persion p:testPersionList){
     System.out.println("after testPersionList Sort: " + p.getName());
     }
    
    }
    
    private static List<Persion> createPersionList() {
    List<Persion> persionList=new ArrayList<Persion>();
    
    Calendar cal = Calendar.getInstance();
    
    cal.set(Calendar.YEAR, 1991);
    cal.set(Calendar.MONTH, Calendar.JUNE);
    cal.set(Calendar.DAY_OF_MONTH, 03);
    Date dobShama = cal.getTime();
    
    cal.set(Calendar.YEAR, 1945);
    cal.set(Calendar.MONTH, Calendar.MAY);
    cal.set(Calendar.DAY_OF_MONTH, 28);
    Date dobAmma = cal.getTime();
    
    cal.set(Calendar.YEAR, 1979);
    cal.set(Calendar.MONTH, Calendar.AUGUST);
    cal.set(Calendar.DAY_OF_MONTH, 22);
    Date dobSadd = cal.getTime();
    
    
    Persion shama= new Persion(); shama.setName("Shama"); shama.setHeight(new Float("5.3"));shama.setDob(dobShama);
    Persion amma= new Persion(); amma.setName("Amma"); amma.setHeight(new Float("5.1"));amma.setDob(dobAmma);
    Persion sadd= new Persion(); sadd.setName("Sadd"); sadd.setHeight(new Float("5.5"));sadd.setDob(dobSadd);

    persionList.add(shama);
    persionList.add(amma);
    persionList.add(sadd);
    
    return persionList;
    
    }

}
