package com.ten.july;

import static java.lang.System.*;

public class ThreadGroup1 {
    public static void main(String[] args) {
//        //every thread in java in some group
//        //every thread group in java is child group of system group either directly or indirectly hence system ; in main group
//        //system group contains several several threads
//        //finalize, reference handler, signal dispacher  etc
//
//        //main group
//        System.out.println(Thread.currentThread().getThreadGroup().getName());
//
//        //system group
//        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
//
//        //thread group is  java class present in java.lang package and it is the child class of object
//
//
//        //constructor
//
//        // ThreadGroup g=new ThreadGroup(String name);
//
//
//        ThreadGroup g = new ThreadGroup("firstGroup");
//        System.out.println(g.getParent().getName());
//
//        //Thread g= new ThreadGroup (g,"string name");
//
//        ThreadGroup g2=new ThreadGroup(g,"second group" );
//        System.out.println(g2.getParent().getName());
//
//
        ThreadGroup g=Thread.currentThread().getThreadGroup().getParent();
        Thread[] t1 = new Thread[g.activeCount()];
     //   System.enumerate(t1);
        for (Thread t:t1){
           System.out.println(t.getName()+"...."+t.isDaemon());
        }

    }
}
