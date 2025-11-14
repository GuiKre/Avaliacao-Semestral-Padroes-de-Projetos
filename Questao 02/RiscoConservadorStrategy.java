public class RiscoConservadorStrategy implements CalculoRisco {
    
    @Override
    public void calcularPerfil(double valorInvestido) {
        System.out.println("Cálculo Conservador");
        System.out.println("Pouco risco");
        System.out.println("Risco estimado: BAIXO");
    }
}