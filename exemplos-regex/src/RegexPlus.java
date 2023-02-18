public class RegexPlus {
    public static void main(String[] args) {
        String texto = "O valor do produto é @xxxxxxxxxx@.";
        String novoTexto = texto.replaceAll("@x+@", "2,50"); // "x+" em regex: Pode haver um ou mais letras x na expressão

        System.out.println(novoTexto);
    }
}