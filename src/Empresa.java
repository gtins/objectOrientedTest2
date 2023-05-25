public class Empresa extends GerenciadorDeClasses{

    public void addContato(int numero, String nome) {
        String especial = ("Empresa: " + nome);
        contatos.put(numero, especial);
        System.out.println("Contato Adicionado: " + especial + " - " + numero);
        System.out.println(especial);
    }
}
