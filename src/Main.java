public class Main {
    public static void main(String[] args) {
        GerenciadorDeClasses aplicativo = new GerenciadorDeClasses();
        aplicativo.addContato(3,"kleber");
        aplicativo.addContato(4,"pedro");
        aplicativo.addContato(5,"maria");
        aplicativo.addContato(8,"rosa");
        aplicativo.remContato("kleber");
        aplicativo.showContatos();
        int numero = aplicativo.searchContato("rosa");
        System.out.println(numero);
    }
}
