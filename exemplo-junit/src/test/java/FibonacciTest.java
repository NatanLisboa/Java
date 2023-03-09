import com.algaworks.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void should_return_fibonacci_position_1() {
        // 1. Cenário
        long position = 1L;

        // 2. Ação
        long value = Fibonacci.calcularFibonacci(position);

        //3. Validação
        Assertions.assertEquals(1L, value);
    }

    @Test
    public void should_return_fibonacci_position_2() {
        // 1. Cenário
        long position = 2L;

        // 2. Ação
        long value = Fibonacci.calcularFibonacci(position);

        //3. Validação
        Assertions.assertEquals(1L, value);
    }

    @Test
    public void should_return_fibonacci_position_0() {
        // 1. Cenário
        long position = 2L;

        // 2. Ação
        long value = Fibonacci.calcularFibonacci(position);

        //3. Validação
        Assertions.assertEquals(1L, value);
    }
}
