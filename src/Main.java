public class Main {
    public static void main(String[] args) {
        GerenciadorDeClasses encontrar = new GerenciadorDeClasses();
        GerenciadorDeClasses remover = new GerenciadorDeClasses();
        GerenciadorDeClasses listar = new GerenciadorDeClasses();
        encontrar.addContato(3,"kleber");
        encontrar.addContato(4,"pedro");
        encontrar.addContato(5,"maria");
        encontrar.addContato(8,"rosa");
        listar.lista();
    }
}
