public class RegraCorredorOnibus extends RegraMulta {
    private int horaInicio;
    private int horaFim;
    private String logradouro;

    public RegraCorredorOnibus(int horaInicio, int horaFim, String logradouro) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.logradouro = logradouro;
    }

    @Override
    public int verificaNivelMulta(Ocorrencia ocorrencia) {
        int horaAtual = 15; // Simulação de horário atual
        if (ocorrencia.getLogradouro().equals(this.logradouro) &&
            horaAtual >= horaInicio && horaAtual <= horaFim) {
            return MULTA_GRAVE;
        }
        return SEM_MULTA;
    }
}
