package com.example.demo;

/**
 * Created by David on 26.06.2017.
 */
public class Tee {
    public static void my() throws InterruptedException {
        int[] i = {1};
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(i[0]++);
            }
        };
       r.run();
        System.out.println(i[0]);
    }

    public static void main(String... args) throws InterruptedException {
        my();
    }
}
