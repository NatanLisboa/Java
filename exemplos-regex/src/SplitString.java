public class SplitString {

    public static void main(String[] args) {
        String texto = "O4Java1é3uma9linguagem9orientada1a8objetos";

        String[] palavras = texto.split("\\d"); // regex "\d": Representa um dígito. Nesse caso, quebrará nos dígitos
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

    }
}
