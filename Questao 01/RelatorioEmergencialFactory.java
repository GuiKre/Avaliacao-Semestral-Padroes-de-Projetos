public class RelatorioEmergencialFactory implements RelatorioFactory {

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}
