import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {

    public static void main(String[] args) {
        String[] emails = {"joao@joao.com", "maria@", "jose@jose", "ricardo@ricardo.com"};

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+"); // \w: caractere
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("E-mail válido: " + email);
            } else {
                System.out.println("E-mail inválido: " + email);
            }
        }
    }
}
