package com.sadd.heapdump;

public class OutOfMemory {

  
/**
   * @param args
   */

  public static void main(String[] args) {
  MyArrayList list =  new MyArrayList();
    while (1<2){
        System.out.println("adding to List");
        calculateMemory();
      list.add("OutOfMemoryError soon");
    }

  }

    private static void calculateMemory() {

    int mb = 1024 * 1024;

    // Getting the runtime reference from system
    Runtime runtime = Runtime.getRuntime();

    System.out.println("##### Heap utilization statistics [MB] #####");

    // Print used memory
    System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);

    // Print free memory
    System.out.println("Free Memory:" + runtime.freeMemory() / mb);

    // Print total available memory
    System.out.println("Total Memory:" + runtime.totalMemory() / mb);

    // Print Maximum available memory
    System.out.println("Max Memory:" + runtime.maxMemory() / mb);

    }

}
