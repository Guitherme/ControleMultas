public class Ocorrencia {
    private String placa;
    private String logradouro;
    private String data; // Formato: dd/MM/yyyy
    private String hora; // Formato: HH:mm

    // Construtor
    public Ocorrencia(String placa, String logradouro, String data, String hora) {
        this.placa = placa;
        this.logradouro = logradouro;
        this.data = data;
        this.hora = hora;
    }

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }
}
