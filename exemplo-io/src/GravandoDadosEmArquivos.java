import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoDadosEmArquivos {
    public static void main(String[] args) throws IOException {
        String[] emails = {"joao@joao.com", "maria@maria.com", "ricardo@ricardo.com", "eitapapai@viu.com"};

        /*
            input: Fonte de dados envia dados para programa Java
            output: Programa Java envia dados para fonte de dados (um arquivo, por exemplo)
         */

        //try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))) { // Como BufferedWriter implementa Closeable, ele será fechado automaticamente com o try-with-resources
        try (PrintStream writer = new PrintStream("emails2.txt")) { // Outro jeito de gravar em arquivo com quebra de linha
            for (String email : emails) {
                //writer.write(email);
                //writer.newLine();
                writer.println(email);
            }
        } catch (IOException e) {
            System.err.println("Não foi possível gravar no arquivo: " + e.getMessage());
        }
    }
}