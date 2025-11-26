package StringPractice;
public class StringPerfCompare {
    static final int N = 5_000_00; // 500k appends

    public static void main(String[] args) {
        long t1 = timeAppendStringBuilder();
        long t2 = timeAppendStringBuffer();
        System.out.println("StringBuilder (single-thread): " + t1 + " ms");
        System.out.println("StringBuffer  (single-thread): " + t2 + " ms");
    }

    static long timeAppendStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append('a');
        return System.currentTimeMillis() - start;
    }

    static long timeAppendStringBuffer() {
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) sb.append('a'); // synchronized
        return System.currentTimeMillis() - start;
    }
}
