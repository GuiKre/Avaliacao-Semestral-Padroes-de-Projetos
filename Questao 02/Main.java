public class Main {
    public static void main(String[] args) {

        Context analise = new Context();
        double valorInvestimento = 10000.00;

        System.out.println("Cliente A - Conservador");
        analise.setEstrategia(new RiscoConservadorStrategy());
        analise.realizarAnalise(valorInvestimento);

        System.out.println("Cliente B - Moderado");
        analise.setEstrategia(new RiscoModeradoStrategy()); 
        analise.realizarAnalise(valorInvestimento);

        System.out.println("Cliente C - Agressivo");
        analise.setEstrategia(new RiscoAgressivoStrategy());
        analise.realizarAnalise(valorInvestimento);
    }
}