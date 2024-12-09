public abstract class RegraMulta {
    protected static final int SEM_MULTA = 0;
    protected static final int MULTA_LEVE = 1;
    protected static final int MULTA_MEDIA = 2;
    protected static final int MULTA_GRAVE = 3;

    public abstract int verificaNivelMulta(Ocorrencia ocorrencia);

    public String obterDescricaoMulta(int nivelMulta) {
        switch (nivelMulta) {
            case MULTA_LEVE: return "Multa leve";
            case MULTA_MEDIA: return "Multa média";
            case MULTA_GRAVE: return "Multa grave";
            default: return "Sem multa";
        }
    }
}
