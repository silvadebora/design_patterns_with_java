public class Santander implements CalculaJurosStrategyInterface{

    @Override
    public Integer getTaxaDeJuros(Pedido pedido) {
        return 10;
    }
}
