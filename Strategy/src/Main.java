public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(10);
        Santander banco = new Santander();
        CalculadoraDeJuros calculadoraDeJuros = new CalculadoraDeJuros(banco);
        Integer juros = calculadoraDeJuros.calculaJuros(pedido);
        System.out.println(juros);
    }
}
