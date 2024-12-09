import java.util.Scanner;

public class MenuPrincipal {
    private static BaseDeDados baseDeDados = new BaseDeDados();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Controle de Multas ---");
            System.out.println("1. Cadastrar Ocorrência");
            System.out.println("2. Visualizar Ocorrências");
            System.out.println("3. Visualizar Multas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarOcorrencia(scanner);
                    break;
                case 2:
                    visualizarOcorrencias();
                    break;
                case 3:
                    visualizarMultas();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarOcorrencia(Scanner scanner) {
        System.out.println("\n--- Cadastro de Ocorrência ---");
        System.out.print("Placa do veículo: ");
        String placa = scanner.nextLine();
        System.out.print("Logradouro: ");
        String logradouro = scanner.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String data = scanner.nextLine();
        System.out.print("Hora (HH:mm): ");
        String hora = scanner.nextLine();

        Ocorrencia ocorrencia = new Ocorrencia(placa, logradouro, data, hora);
        baseDeDados.adicionarOcorrencia(ocorrencia);
        System.out.println("Ocorrência cadastrada com sucesso!");
    }

    private static void visualizarOcorrencias() {
        System.out.println("\n--- Ocorrências Cadastradas ---");
        for (Ocorrencia ocorrencia : baseDeDados.getNaoProcessadas()) {
            System.out.println("Placa: " + ocorrencia.getPlaca());
            System.out.println("Logradouro: " + ocorrencia.getLogradouro());
            System.out.println("Data: " + ocorrencia.getData());
            System.out.println("Hora: " + ocorrencia.getHora());
            System.out.println("---------------------------------");
        }
    }

    private static void visualizarMultas() {
        System.out.println("\n--- Multas Geradas ---");
        for (Multa multa : baseDeDados.getMultas()) {
            System.out.println("Placa: " + multa.getPlaca());
            System.out.println("Descrição: " + multa.getDescricao());
            System.out.println("Nível da Multa: " + multa.getNivelMulta());
            System.out.println("---------------------------------");
        }
    }
}
