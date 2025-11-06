public class R52_Different_States_Of_A_Thread {
    private static final Object LOCK = new Object();
    public static class StateDemoThread extends Thread {
        public StateDemoThread(String name) {
            super(name);
        }
        @Override
        public void run() {
            try {
                System.out.println(getName() + " is in RUNNABLE state.");
                System.out.println(getName() + " calling sleep(100)...");
                Thread.sleep(100); 
                System.out.println(getName() + " out of sleep. Entering synchronized block.");                
                synchronized (LOCK) { 
                    System.out.println(getName() + " is holding the lock and calling wait()...");
                    LOCK.wait(); 
                    System.out.println(getName() + " received notify() and is RUNNABLE again.");
                }
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(getName() + " was interrupted.");
            }
            System.out.println(getName() + " finished its execution.");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        StateDemoThread t1 = new StateDemoThread("StateDemo-1"); 
        System.out.println("Main: State after creation (NEW): " + t1.getState());
        t1.start(); 
        System.out.println("Main: State after start() (RUNNABLE): " + t1.getState());
        Thread.sleep(50); 
        System.out.println("Main: State during sleep() (TIMED_WAITING): " + t1.getState()); 
        Thread.sleep(100); 
        System.out.println("Main: State during wait() (WAITING): " + t1.getState());
        System.out.println("Main: Entering synchronized block to notify...");        
        synchronized (LOCK) { 
            System.out.println("Main: Calling notify() to wake up " + t1.getName());
            LOCK.notify();
        } 
        t1.join();
        System.out.println("Main: State after thread completion (TERMINATED): " + t1.getState());
    }
}