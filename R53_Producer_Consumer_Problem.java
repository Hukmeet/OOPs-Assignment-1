/*
    WARNING!!! Run with Caution.
    The execution of this program is never-ending so it needs to be stopped externally.
    Please press Ctrl+C once you deign the program has run it's required course to terminate it's execution.
*/
import java.util.LinkedList;
class PC {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (list) {
                while (list.size() == capacity) {
                    list.wait();
                }
                System.out.println("Producer produced-" + value);
                list.add(value++);
                list.notify();
                Thread.sleep(100);
            }
        }
    }
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (list) {
                while (list.size() == 0) {
                    list.wait();
                }
                int val = list.removeFirst();
                System.out.println("Consumer consumed-" + val);
                list.notify();
                Thread.sleep(100);
            }
        }
    }
}
public class R53_Producer_Consumer_Problem {
    public static void main(String[] args) throws InterruptedException {        
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}