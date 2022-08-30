package vn.plusplus;

import static java.lang.Thread.sleep;

public class Activity2 {
    public Activity2 () {
        Thread thread1 = new Thread(new MyThread("ABC", 3500));
        Thread thread2 = new Thread(new MyThread("DEF", 2500));
        thread1.setName("ABC");
        thread2.setName("DEF");
        thread1.start();
        thread2.start();
    }
}

class MyThread implements Runnable {
    long milisecond;
    String prefix;

    public MyThread(String prefix, long milisecond) {
        this.prefix = prefix;
        this.milisecond = milisecond;
    }

    @Override
    public void run() {
        System.out.println("Thread " + prefix + ": " + System.currentTimeMillis());
        try {
            sleep(milisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
