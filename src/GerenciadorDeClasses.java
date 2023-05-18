import java.util.HashMap;
public class GerenciadorDeClasses {
    HashMap<Integer, String> contatos = new HashMap<>();

    public void addContato(int numero, String nome) {
        contatos.put(numero, nome);
        System.out.println(contatos.values());
    }

    public void remContato(int numero) {
        contatos.remove(numero);
    }

    public void lista() {
        System.out.println("cu:");
        for (Integer chave : lista();) {
            System.out.println(chave);
        }
        for (String valor : contatos.values()) {
            System.out.println(valor);

//        System.out.println("Valores do HashMap:");
//        var lista = contatos.values();
//        for (lista : contatos.values()) {
//            System.out.println(lista);
//        }
        }


    }
}
