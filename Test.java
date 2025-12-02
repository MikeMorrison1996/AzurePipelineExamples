

public class Test {

    /**
     * Pretend this is "real work" our CI cares about.
     */
    public static int expensiveComputation(int base) {
        // A tiny loop just so we have some CPU work (but not too slow)
        int result = base;
        for (int i = 0; i < 1_000; i++) {
            result = (result * 31 + i) % 10_000;
        }
        return result;
    }

    public static void main(String[] args) {
        int value = expensiveComputation(42);
        System.out.println("Computation result = " + value);
    }
}
