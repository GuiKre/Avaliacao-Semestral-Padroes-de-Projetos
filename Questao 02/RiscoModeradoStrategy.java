public class RiscoModeradoStrategy implements CalculoRisco {

    @Override
    public void calcularPerfil(double valorInvestido) {
        System.out.println("Cálculo Moderado");
        System.out.println("Médio risco");
        System.out.println("Risco estimado: MÉDIO");
    }
}