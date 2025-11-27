package src.StringPractice;
public class StringBufferDemo {
    public static void main(String[] args) throws InterruptedException {
        final StringBuffer sbuf = new StringBuffer();
        int threads = 10;
        int appendsPerThread = 1000;

        Thread[] workers = new Thread[threads];
        for (int t = 0; t < threads; t++) {
            workers[t] = new Thread(() -> {
                for (int i = 0; i < appendsPerThread; i++) {
                    sbuf.append("X");  // synchronized method
                }
            });
            workers[t].start();
        }
        for (Thread w : workers) w.join();

        System.out.println("Expected length: " + (threads * appendsPerThread));
        System.out.println("Actual length:   " + sbuf.length());
        // Content correctness: all 'X's, no corruption
    }
}