import java.util.ArrayList;

public class BaseDeDados {
    private ArrayList<Ocorrencia> naoProcessadas = new ArrayList<>();
    private ArrayList<Ocorrencia> processadas = new ArrayList<>();
    private ArrayList<Multa> multas = new ArrayList<>();

    public void adicionarOcorrencia(Ocorrencia ocorrencia) {
        naoProcessadas.add(ocorrencia);
    }

    public ArrayList<Ocorrencia> getNaoProcessadas() {
        return naoProcessadas;
    }

    public ArrayList<Multa> getMultas() {
        return multas;
    }

    public void inicializaRegras() {
        // Exemplos de inicialização de regras
        // regras.add(new RegraVelocidade(60, "Avenida Washington Luiz"));
        // regras.add(new RegraRodizio(1, new String[]{"Avenida Bandeirantes", "Avenida 23 de Maio"}, 1));
    }
}
