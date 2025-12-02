import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void expensiveComputationIsDeterministic() {
        int first = App.expensiveComputation(42);
        int second = App.expensiveComputation(42);
        Assertions.assertEquals(first, second,
                "expensiveComputation should be deterministic for the same base");
    }

    @Test
    void expensiveComputationChangesWithInput() {
        int a = App.expensiveComputation(1);
        int b = App.expensiveComputation(2);
        Assertions.assertNotEquals(a, b,
                "Different inputs should produce different results");
    }
}
