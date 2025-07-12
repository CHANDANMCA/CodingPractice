package com.ten.july;

public class DeadLock1 extends  Thread {
    A a = new A();
    B b = new B();
    void m1() throws InterruptedException {
        this.start();
        a.d1(b);
    }

    @Override
    public void run() {
        try {
            b.d2(a);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public  static void main(String[] args) throws InterruptedException {
        DeadLock1 dead = new DeadLock1();
        dead.m1();

    }
}
class A{
    synchronized void d1(B b) throws InterruptedException {
        System.out.println("Thread start execution of d1 method");
        try {
            Thread.sleep(5000);

        }catch (InterruptedException e){

        }
        System.out.println("thred1 trying to call B last method");
        b.wait();
    }
    public synchronized  void  last(){
        System.out.println("inside A Last method");
    }
}
class B{
synchronized  void d2(A a) throws InterruptedException {
    System.out.println("thread start with d2 method");
    try{
        Thread.sleep(5000);
    }catch (InterruptedException e){

    }
    System.out.println("Thread trying to call last method");
    a.last();
}
public synchronized void last(){
    System.out.println("inside B last method ");
}
}