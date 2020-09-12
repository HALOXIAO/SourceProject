package jdk8.source.learn.java;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author HALOXIAO
 * @since 2020-08-31 20:09
 **/
public class AQSLearn implements Runnable {
    ReentrantLock lock = new ReentrantLock(true);
    Semaphore semaphore = new Semaphore(2);
    int x = 0;



    public static void main(String[] args) throws InterruptedException {
        Runnable task = new AQSLearn();
        Thread thread1 = new Thread(task, "1");
        Thread thread2 = new Thread(task, "2");
        Thread thread3 = new Thread(task, "3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        int x = 0;
        lock.lock();
        lock.unlock();
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }


}
