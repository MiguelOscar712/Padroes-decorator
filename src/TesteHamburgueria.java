public class TesteHamburgueria {

    public static void main(String[] args) {

        System.out.println("TESTE 1: Hamburguer Simples");
        HamburguerFactory factorySimples = new FactorySimples();
        Hamburguer hamburguerSimples = factorySimples.criarHamburguer();

        System.out.println("Descricao: " + hamburguerSimples.getDescricao());
        System.out.println("Preco: " + hamburguerSimples.getPreco());

        System.out.println("\nTESTE 2: Adicionando Queijo");
        hamburguerSimples = new Queijo(hamburguerSimples);

        System.out.println("Descricao: " + hamburguerSimples.getDescricao());
        System.out.println("Preco: " + hamburguerSimples.getPreco());

        System.out.println("\nTESTE 3: Adicionando Bacon");
        hamburguerSimples = new Bacon(hamburguerSimples);

        System.out.println("Descricao: " + hamburguerSimples.getDescricao());
        System.out.println("Preco: " + hamburguerSimples.getPreco());

        System.out.println("\nTESTE 4: Hamburguer Premium (Factory)");
        HamburguerFactory factoryPremium = new FactoryPremium();
        Hamburguer hamburguerPremium = factoryPremium.criarHamburguer();

        System.out.println("Descricao:" + hamburguerPremium.getDescricao());
        System.out.println("Preco:" + hamburguerPremium.getPreco());

        System.out.println("\nTESTE 5: Premium + Extra Queijo");
        hamburguerPremium = new Queijo(hamburguerPremium);

        System.out.println("Descricao: " + hamburguerPremium.getDescricao());
        System.out.println("Preco: " + hamburguerPremium.getPreco());
    }
}