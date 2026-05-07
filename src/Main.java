public class Main {
    public static void main(String[] args) {

        HamburguerFactory factory1 = new FactorySimples();
        Hamburguer h1 = factory1.criarHamburguer();

        h1 = new Queijo(h1);

        System.out.println(h1.getDescricao());
        System.out.println("Preço: " + h1.getPreco());

        System.out.println("------------");

        HamburguerFactory factory2 = new FactoryPremium();
        Hamburguer h2 = factory2.criarHamburguer();

        System.out.println(h2.getDescricao());
        System.out.println("Preço: " + h2.getPreco());
    }
}