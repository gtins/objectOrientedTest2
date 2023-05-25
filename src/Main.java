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

            aplicativo.addContato(ctNumero, ctNome);
        }
//--------------------------------------------
        aplicativo.remContato("João");
//--------------------------------------------
        aplicativo.gravar("agenda");
        aplicativo.contatos.clear();
        aplicativo.leitura("agenda");
//--------------------------------------------
        aplicativo.showContatos();
//--------------------------------------------
        String contatosTexto = aplicativo.parseTexto();
        System.out.println(contatosTexto);
//--------------------------------------------
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
//class verificaçao

        System.out.println("-----------------------");

        System.out.println("Digite o nome do contato empresarial: ");
        String emNome = myObj.nextLine();
        System.out.println("Digite o número do contato empresarial: ");
        int emNumero = Integer.parseInt(myObj.nextLine());
//class empresa
        empresarial.addContato(emNumero,emNome);
        empresarial.showContatos();
    }
}

