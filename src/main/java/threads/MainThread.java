package threads;

import static threads.ThreadColor.*;

public class MainThread {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "MAIN thread starts");

        SeparateThread separateThread = new SeparateThread();
        separateThread.setName("Osobny zajefajny wątek");
        separateThread.start();

        Thread runnableSample = new Thread(new RunnableSample());
        runnableSample.start();

        /**
         * jak mamy bardzo jednorazowe zadanko to możemy je odpalić
         * w klasie anonimowej
         */

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Anonymous class thread launched");
            }
        }.start();

        runnableSample = new Thread(new RunnableSample() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "Overwritten RunnableSample");
                try {
                    separateThread.join();
                    System.out.println(ANSI_CYAN + "SeparateThread finished, I can continue");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_CYAN + "Overwritten RunnableSample interrupted");
                }
            }
        });
        runnableSample.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        separateThread.interrupt();
        runnableSample.interrupt();

        System.out.println(ANSI_PURPLE + "MAIN ends work");
    }
}
