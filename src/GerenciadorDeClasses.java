import java.util.HashMap;
public class GerenciadorDeClasses {
    HashMap<Integer, String> contatos = new HashMap<>();

    public void addContato(int numero, String nome) {
        contatos.put(numero, nome);
    }

    public void remContato(String nome){
        for (HashMap.Entry<Integer, String> entry : contatos.entrySet()) { //para a entrada do hashmap, que recebe intger e string, para cada entryset de contatos...
            if (entry.getValue().equals(nome)) {//se o valor da entrada equivaler ao nome (parametro do metodo)...
                contatos.remove(entry.getKey());//remove
                break; //fim do loop
            }
        }
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
