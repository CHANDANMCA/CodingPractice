package com.ten.july;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b) {
            System.out.println("main Thread calling wait");
            b.wait();
            System.out.println("main thread got notification");
            System.out.println(b.total);
        }
    }
}

class ThreadB extends Thread {
    int total = 0;
    public void run() {
        synchronized (this) {
            System.out.println("child thread start  calculation");
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            System.out.println("child thread given notification");
            this.notify();
        }
    }
}
