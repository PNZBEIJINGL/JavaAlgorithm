package com.java6;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DaemonThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                // 线程工厂（设置守护线程）
                ThreadFactory threadFactory = r -> {
                    Thread thread = new Thread(r);
                    // 设置为守护线程
                    thread.setDaemon(true);

                    return thread;
                };

                // 创建线程池
                ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 10,
                        0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(100), threadFactory);

                threadPool.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName() +
                                (Thread.currentThread().isDaemon() == true ? "守护线程" : "用户线程"));
                        try {
                            Thread.sleep(5000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + " end");
                    }
                });

                try {
                    threadPool.shutdown();
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " END");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();


        Thread.sleep(10000);
        System.out.println(Thread.currentThread().getName() + " end");
      /*  // 线程工厂（设置守护线程）
        ThreadFactory threadFactory = r -> {
            Thread thread = new Thread(r);
            // 设置为守护线程
            thread.setDaemon(true);
            return thread;
        };

        // 创建线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 10,
                0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(100), threadFactory);

        for (int i = 0; i < 2; i++) {
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() +
                            (Thread.currentThread().isDaemon() == true ? "守护线程" : "用户线程"));
                    try {
                        Thread.sleep(5000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " end");
                }
            });

        }
        threadPool.shutdown();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+" END");*/
    }

}


