import java.util.HashMap;
public class GerenciadorDeClasses {
    HashMap<Integer, String> contatos = new HashMap<>();

    public void addContato(int numero, String nome) {
        contatos.put(numero, nome);
    }

    public void remContato(int numero) {
        contatos.remove(numero);
    }

    public void showContatos() {
        for (String nome : contatos.values()) {
            System.out.println(nome);
        }
    }
    public int searchContato(String nome) {
        for (int numero : contatos.keySet()) {
            if (contatos.get(numero).equals(nome)) {
                return numero;
            }
        }
        return -404;
    }
}
