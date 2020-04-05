import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class FizzBuzz2Test {
    private FizzBuzz2 fb;
    @Test
    void 三の倍数でも五の倍数でもない場合() {
        fb = new FizzBuzz2(1);
        assertEquals(fb.fizzbuzz2(), "1");
    }
    @Test
    void 三の倍数の場合() {
        fb = new FizzBuzz2(3);
        assertEquals(fb.fizzbuzz2(), "Fizz");
    }
    @Test
    void 五の倍数の場合() {
        fb = new FizzBuzz2(5);
        assertEquals(fb.fizzbuzz2(), "Buzz");
    }
    @Test
    void 三と五の倍数の場合() {
        fb = new FizzBuzz2(15);
        assertEquals(fb.fizzbuzz2(), "FizzBuzz");
    }
}