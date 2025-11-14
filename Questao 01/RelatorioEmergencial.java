public class RelatorioEmergencial implements Relatorio {
    @Override
    public void gerarCabecalho() {
        System.out.println("Relatorio Emergencial");
    }

    @Override
    public void processarDados() {
        System.out.println("Dados do relatorio emergencial");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Fim do relatório emergencial\n");
    }
}