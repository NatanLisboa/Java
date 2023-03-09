public class Fibonacci {

    public static long calcularFibonacci(long posicao) {
        if (posicao == 1 || posicao == 2) {
            return 1;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }
}
