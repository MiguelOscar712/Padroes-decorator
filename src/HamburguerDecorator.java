public abstract class HamburguerDecorator implements Hamburguer {
    protected Hamburguer hamburguer;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao();
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco();
    }
}