import java.time.LocalDateTime;
import java.util.Map;
import java.time.format.DateTimeFormatter;

public class Empresa extends GerenciadorDeClasses{

    public void addContato(int numero, String nome) {
        String especial = ("Empresa - " + nome);
        contatos.put(numero, especial);
        System.out.println("Contato Empresarial Adicionado: " + especial + " - " + numero);
    }
    public void showContatos() {
        for (Map.Entry<Integer, String> contato : contatos.entrySet()) {
            int numMapa = contato.getKey();
            String nomeMapa = contato.getValue();

            LocalDateTime horAdd = LocalDateTime.now();

            DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String formatado = horAdd.format(formatacao);

            System.out.println("Data adicionado - " + formatado);

        }
    }
}
