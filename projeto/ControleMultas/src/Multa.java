public class Multa {
    private String placa;
    private String descricao;
    private int nivelMulta; // 0 = Sem multa, 1 = Leve, 2 = Média, 3 = Grave

    // Construtor
    public Multa(String placa, String descricao, int nivelMulta) {
        this.placa = placa;
        this.descricao = descricao;
        this.nivelMulta = nivelMulta;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNivelMulta() {
        return nivelMulta;
    }
}
