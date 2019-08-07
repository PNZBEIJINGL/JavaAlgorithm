package com.algorithm.number;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * N 数求和
 */
public class Sum {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start1 = System.currentTimeMillis();
        int sum=0;
        for(int i=1;i<1000;i++){
            System.out.println(sum);
            sum=sum+i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("计算耗时：" + (end1 - start1) + " ms");
        System.out.println("计算的结果：" + sum);

        System.out.println("----");
        mutilSum(1000, 10);
    }

    public static void mutilSum(int N, int numThread) throws ExecutionException,
            InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(numThread);
        long start1 = System.currentTimeMillis();
        List<Future<Long>> batch = new ArrayList<Future<Long>>();
        for (int i = 0; i < numThread; i++) {
            Future<Long> a = executor.submit(
                    new SumThread(i * N / numThread, (i + 1) * N / numThread));
            batch.add(a);
        }
        long sum = 0;
        for (Future<Long> i : batch) {
            long tmp = i.get();
            sum += tmp;
        }
        //并行计算
        long end1 = System.currentTimeMillis();
        System.out.println("并行计算耗时：" + (end1 - start1) + " ms");
        System.out.println("并行计算的结果：" + sum);
    }
}

class SumThread implements Callable<Long> {

    private long start;
    private long end;

    public SumThread(long start, long end) {
        this.start = start;
        this.end = end;
    }


    public Long call() throws Exception {
        long sum = 0L;
        for (long i = start; i < end; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() +" "+ start+"|"+end+"|"+sum);
        return sum;
    }

}
