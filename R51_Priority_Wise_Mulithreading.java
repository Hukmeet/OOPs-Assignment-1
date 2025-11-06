class ByExtending extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Running Thread " + i);
    }
}
class ByImplementing implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Running Thread " + i);
    }
}
public class R51_Priority_Wise_Mulithreading {
    public static void main(String[] args) {
        ByExtending t1 = new ByExtending();
        t1.start();
        Thread t2 = new Thread(new ByImplementing());
        t2.start();
    }
}