public class RegraVelocidade extends RegraMulta {
    private int velocidadeMaxima;
    private String logradouro;

    public RegraVelocidade(int velocidadeMaxima, String logradouro) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.logradouro = logradouro;
    }

    @Override
    public int verificaNivelMulta(Ocorrencia ocorrencia) {
        // Simulação de lógica com dados fictícios
        int velocidadeRegistrada = 80; // Valor simulado
        if (ocorrencia.getLogradouro().equals(this.logradouro)) {
            if (velocidadeRegistrada > velocidadeMaxima + 20) {
                return MULTA_GRAVE;
            } else if (velocidadeRegistrada > velocidadeMaxima + 10) {
                return MULTA_MEDIA;
            } else if (velocidadeRegistrada > velocidadeMaxima) {
                return MULTA_LEVE;
            }
        }
        return SEM_MULTA;
    }
}
