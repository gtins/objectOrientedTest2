import java.io.*;
import java.util.HashMap;

public class GerenciadorDeClasses {
    HashMap<Integer, String> contatos = new HashMap<>();

    public void addContato(int numero, String nome) {
        contatos.put(numero, nome);
        System.out.println("Contato Adicionado: " + nome + " - " + numero);
    }

    public void remContato(String nome){
        System.out.println("Removendo Contato...");
        for (HashMap.Entry<Integer, String> entry : contatos.entrySet()) { //para a entrada do hashmap, que recebe intger e string, para cada entryset de contatos...
            if (entry.getValue().equals(nome)) {//se o valor da entrada equivaler ao nome (parametro do metodo)...
                contatos.remove(entry.getKey());//remove
                System.out.println("Contato Removido: " + nome);
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

    public void gravar(String arquivo){
        try {

            FileOutputStream gravado = new FileOutputStream(arquivo);
            ObjectOutputStream saida = new ObjectOutputStream(gravado);

            saida.writeObject(contatos);

            System.out.println("Contatos gravados em: " + arquivo);
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void leitura(String arquivo){
        try {

            FileInputStream lendo =  new FileInputStream(arquivo);
            ObjectInputStream entrada = new ObjectInputStream(lendo);

            contatos = (HashMap<Integer, String>) entrada.readObject(); // cast? (intelij corrigiu)

            System.out.println("Contatos lidos de: " + arquivo);
            parseTexto();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public String parseTexto() {

        StringBuilder text = new StringBuilder();

        for (Integer numero : contatos.keySet()) { // para ( para cada numero no keyset de contatos) nome recebe o getter do numero de contatos
            String nome = contatos.get(numero);
            text.append(nome).append(" - ").append(numero).append("\n");
        }
        return text.toString();
    }
}
