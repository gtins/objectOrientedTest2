import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Empresa extends GerenciadorDeClasses{
    LocalDateTime horAdd = LocalDateTime.now();
    DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    public void addContato(int numero, String nome) {
        String especial = ("Empresa - " + nome);
        contatos.put(numero, especial);
        String formatado = horAdd.format(formatacao);

            System.out.println("Contato Empresarial Adicionado: " + especial + " - " + numero);
            System.out.println("Data adicionado - " + formatado);
    }
}
