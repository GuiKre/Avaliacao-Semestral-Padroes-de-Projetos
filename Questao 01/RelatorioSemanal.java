public class RelatorioSemanal implements Relatorio {
    @Override
    public void gerarCabecalho() {
        System.out.println("Relatório Semanal");
    }

    @Override
    public void processarDados() {
        System.out.println("Gerando dados do relatório semanal");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Fim do relatório semanal\n");
    }
}