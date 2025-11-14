public class RelatorioDiario implements Relatorio {
    @Override
    public void gerarCabecalho() {
        System.out.println("Relatório Diário");
    }

    @Override
    public void processarDados() {
        System.out.println("Processando dados do relatório diário");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Fim do relatório diário.\n");
    }
}