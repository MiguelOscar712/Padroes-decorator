public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Queijo";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.0;
    }
}