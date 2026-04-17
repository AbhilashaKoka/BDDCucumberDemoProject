package utilityDemoTest.threadTest;

public class ObjectWaitNotifyExample {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Waiting thread is waiting...");
                    lock.wait();
                    System.out.println("Waiting thread resumed.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread notifyingThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Notifying thread is notifying...");
                lock.notify();
            }
        });

        waitingThread.start();
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        notifyingThread.start();
    }
}
