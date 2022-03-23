package mypackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();
        System.out.println("Hello from MAIN thread");
    }
}

     class MyThread extends Thread{
 
        @Override
        public void run() {
            for (int i = 0; i<1000; i++)
            System.out.println("Hello from MyThread i = " + i);
        }
    }




