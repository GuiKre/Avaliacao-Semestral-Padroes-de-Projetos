public class Main {
    public static void main(String[] args) {

        RelatorioFactory fabrica1 = new RelatorioDiarioFactory();
        Relatorio relatorio1 = fabrica1.criarRelatorio();
        relatorio1.gerarCabecalho();
        relatorio1.processarDados();
        relatorio1.gerarRodape();

        RelatorioFactory fabrica2 = new RelatorioSemanalFactory();
        Relatorio relatorio2 = fabrica2.criarRelatorio();
        relatorio2.gerarCabecalho();
        relatorio2.processarDados();
        relatorio2.gerarRodape();

        RelatorioFactory fabrica3 = new RelatorioEmergencialFactory();
        Relatorio relatorio3 = fabrica3.criarRelatorio();
        relatorio3.gerarCabecalho();
        relatorio3.processarDados();
        relatorio3.gerarRodape();
    }
}