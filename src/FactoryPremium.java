public class FactoryPremium implements HamburguerFactory {

    @Override
    public Hamburguer criarHamburguer() {
        Hamburguer h = new HamburguerBase();
        h = new Bacon(h);
        h = new Queijo(h);
        return h;
    }
}