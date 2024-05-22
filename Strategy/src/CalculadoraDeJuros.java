public class CalculadoraDeJuros {

    private CalculaJurosStrategyInterface calculadoraDeJuros;

    public CalculadoraDeJuros(CalculaJurosStrategyInterface calculadoraDeJuros) {
        this.calculadoraDeJuros = calculadoraDeJuros;
    }

    public Integer calculaJuros(Pedido pedido){
        return calculadoraDeJuros.getTaxaDeJuros(pedido);
    }
}
