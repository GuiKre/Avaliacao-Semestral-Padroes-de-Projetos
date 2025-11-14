public class Context {

    private CalculoRisco estrategiaDeCalculo;

    public void setEstrategia(CalculoRisco estrategia) {
        this.estrategiaDeCalculo = estrategia;
    }

    public void realizarAnalise(double valor) {
        if (estrategiaDeCalculo == null) {
            System.out.println("Nenhuma estratégia definida!");
            return;
        }
        estrategiaDeCalculo.calcularPerfil(valor);
        System.out.println(""); 
    }
}
