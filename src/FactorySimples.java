public class FactorySimples implements HamburguerFactory {

    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerBase();
    }
}