import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        GerenciadorDeClasses aplicativo = new GerenciadorDeClasses();
        Empresa empresarial = new Empresa();

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o nome do contato: ");
            String ctNome = myObj.nextLine();
            System.out.println("Digite o número do contato: ");
            int ctNumero = Integer.parseInt(myObj.nextLine());

            System.out.println("-----------------------");

            aplicativo.addContato(ctNumero, ctNome);
        }
//        aplicativo.addContato(88887777,"Gustavo");
//        aplicativo.addContato(77776666,"Ícaro");
//        aplicativo.addContato(66665555,"Glauco");

        System.out.println("-----------------------");

        aplicativo.remContato("João");

        System.out.println("-----------------------");

        aplicativo.gravar("agenda");
        aplicativo.contatos.clear();
        aplicativo.leitura("agenda");

        System.out.println("-----------------------");

        System.out.println("Listando contatos...");
        System.out.println("Contatos:");
        aplicativo.showContatos();

        System.out.println("-----------------------");
        System.out.println("Lendo contatos salvos no disco...");
        System.out.println("Contatos:");
        String contatosTexto = aplicativo.parseTexto();
        System.out.println(contatosTexto);

        System.out.println("-----------------------");

        int numeroJoao = aplicativo.searchContato("João");
        System.out.println("Buscando contato...");

        if (numeroJoao != -404) {
            System.out.println("Número do João: " + numeroJoao);
        } else {
            System.out.println("Contato não encontrado: João");
        }

        int numeroGlauco = aplicativo.searchContato("Glauco");
        System.out.println("Buscando contato...");

        if (numeroGlauco != -404) {
            System.out.println("Número do Glauco: " + numeroGlauco);
        } else {
            System.out.println("Contato não encontrado: Glauco");
        }

        System.out.println("-----------------------");

        empresarial.addContato(8,"jorge");
    }
}

