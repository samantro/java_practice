package StringPractice;
public class StringBuilderWithLock {
    public static void main(String[] args) throws InterruptedException {
        final StringBuilder sb = new StringBuilder();
        final Object lock = new Object();
        int threads = 10;
        int appendsPerThread = 1000;

        Thread[] workers = new Thread[threads];
        for (int t = 0; t < threads; t++) {
            workers[t] = new Thread(() -> {
                for (int i = 0; i < appendsPerThread; i++) {
                    synchronized (lock) {
                        sb.append("X");
                    }
                }
            });
            workers[t].start();
        }
        for (Thread w : workers) w.join();

        System.out.println("Expected length: " + (threads * appendsPerThread));
        System.out.println("Actual length:   " + sb.length());
    }

}
