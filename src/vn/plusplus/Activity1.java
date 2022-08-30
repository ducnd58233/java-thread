package vn.plusplus;

import static java.lang.Thread.sleep;

public class Activity1 {
    public Activity1 (int numThread) {
        for (int i = 1; i <= numThread; i++) {
            Thread thread = new Thread(new A1Thread(i));
            thread.start();
        }
    }
}

class A1Thread implements Runnable {
    int idx;

    public A1Thread (int idx) {this.idx = idx;}

    @Override
    public void run() {
        System.out.println("Thread number " + idx + ": " + System.currentTimeMillis());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
