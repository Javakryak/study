package com.artem;

import static com.artem.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread!");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== ANOTHER TREAD ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anon class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello form anons implementation of run()");
                ;
            }
        });

        myRunnableThread.start();
        anotherThread.interrupt();

//        Thread myRunnableThread = new Thread(new MyRunnable());
//        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");
    }
}
