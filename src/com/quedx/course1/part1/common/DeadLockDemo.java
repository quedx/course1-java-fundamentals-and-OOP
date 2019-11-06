package com.quedx.course1.part1.common;

import java.util.ArrayList;
import java.util.List;

public class DeadLockDemo implements Runnable {

   String o1;
   String o2;

   public DeadLockDemo(String o1, String o2) {
      this.o1 = o1;
      this.o2 = o2;

   }

   @Override
   public void run() {
      System.out.println(Thread.currentThread().getName());

      synchronized (o1) {

         System.out.println(Thread.currentThread().getName() + ": got lock on " + o1);

         try {
            Thread.sleep(2000);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }

         synchronized (o2) {
            System.out.println(Thread.currentThread().getName() + ": got lock on " + o2);

         }

      }

   }

   public static void main(String[] args) {
      String o1 = "first";
      String o2 = "second";
      
      List<Thread> tList = new ArrayList<Thread>();
      tList.add(new Thread(new DeadLockDemo(o1, o2)));
      tList.add(new Thread(new DeadLockDemo(o2, o1)));

      for (Thread t : tList) {
         t.start();
      }

      for (Thread t : tList) {
         try {
            t.join();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }

}
