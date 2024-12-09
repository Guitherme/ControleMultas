public class RegraRodizio extends RegraMulta {
    private int finalPlaca;
    private String[] logradouros;
    private int diaSemana;

    public RegraRodizio(int finalPlaca, String[] logradouros, int diaSemana) {
        this.finalPlaca = finalPlaca;
        this.logradouros = logradouros;
        this.diaSemana = diaSemana;
    }

    @Override
    public int verificaNivelMulta(Ocorrencia ocorrencia) {
        int diaAtual = 1; // Exemplo: segunda-feira
        if (diaAtual == diaSemana && ocorrencia.getPlaca().endsWith(String.valueOf(finalPlaca))) {
            for (String logradouro : logradouros) {
                if (ocorrencia.getLogradouro().equals(logradouro)) {
                    return MULTA_MEDIA;
                }
            }
        }
        return SEM_MULTA;
    }
}
