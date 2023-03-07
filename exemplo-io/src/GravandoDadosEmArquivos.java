import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravandoDadosEmArquivos {
    public static void main(String[] args) throws IOException {
        String[] emails = {"joao@joao.com", "maria@maria.com", "ricardo@ricardo.com"};

        /*
            input: Fonte de dados envia dados para programa Java
            output: Programa Java envia dados para fonte de dados (um arquivo, por exemplo)
         */

        //try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))) { // Como BufferedWriter implementa Closeable, ele será fechado automaticamente com o try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))) {
            for (String email : emails) {
                writer.write(email);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Não foi possível gravar no arquivo: " + e.getMessage());
        }
    }
}