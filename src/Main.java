public class Main {
    public static void main(String[] args) {
        GerenciadorDeClasses aplicativo = new GerenciadorDeClasses();
        System.out.println("-----------------------");

        aplicativo.addContato(99998888,"Kleber");
        aplicativo.addContato(88887777,"Pedro");
        aplicativo.addContato(77776666,"Maria");
        aplicativo.addContato(66665555,"Rosa");

        System.out.println("-----------------------");

        aplicativo.remContato("Kleber");

        System.out.println("-----------------------");

        aplicativo.gravar("teste");
        aplicativo.contatos.clear();
        aplicativo.leitura("teste");

        System.out.println("-----------------------");

        aplicativo.showContatos();

        System.out.println("-----------------------");

        String contatosTexto = aplicativo.parseTexto();
        System.out.println(contatosTexto);

        System.out.println("-----------------------");

        int numeroJoao = aplicativo.searchContato("João");
        if (numeroJoao != -404) {
            System.out.println("Número do João: " + numeroJoao);
        } else {
            System.out.println("Contato não encontrado: João");
        }

        int numeroPedro = aplicativo.searchContato("Pedro");
        if (numeroPedro != -404) {
            System.out.println("Número do Pedro: " + numeroPedro);
        } else {
            System.out.println("Contato não encontrado: pedro");
        }
    }
}
