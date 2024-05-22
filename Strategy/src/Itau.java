public class Itau implements CalculaJurosStrategyInterface{
    @Override
    public Integer getTaxaDeJuros(Pedido pedido) {
        return 20;
    }
}
