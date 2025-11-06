class ByExtending extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Running Thread 1: " + i);
        }
    }
}

class ByImplementing implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Running Thread 2: " + i);
        }
    }
}

public class R49_2_Threads_Unique_Messages {
    public static void main(String[] args) {
        ByExtending t1 = new ByExtending();
        t1.start();

        Thread t2 = new Thread(new ByImplementing());
        t2.start();
    }
}