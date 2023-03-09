public class Main {
    public static void main(String[] args) {
        long posicao = 6;
        long valor = Fibonacci.calcularFibonacci(posicao);

        System.out.println("F(" + posicao + ") = " + valor);
    }
}