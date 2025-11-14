public class RiscoAgressivoStrategy implements CalculoRisco {
    
    @Override
    public void calcularPerfil(double valorInvestido) {
        System.out.println("Cálculo Agressivo");
        System.out.println("Muito risco");
        System.out.println("Risco estimado: ALTO");
    }
}