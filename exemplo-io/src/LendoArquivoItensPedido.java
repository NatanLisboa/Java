import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoArquivoItensPedido {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("itens_pedido.txt")))){
            scanner.useDelimiter(";");
            Locale brazilLocale = new Locale("pt", "BR");
            scanner.useLocale(brazilLocale);

            NumberFormat formatter = NumberFormat.getCurrencyInstance(brazilLocale);

            while(scanner.hasNext()) {
                String nome = scanner.next();
                int quantidade = scanner.nextInt();
                double valor = scanner.nextDouble();
                scanner.nextLine();

                System.out.printf("Produto: %s. Quantidade: %d. Por: %s\n",
                        nome, quantidade, formatter.format(valor));
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
