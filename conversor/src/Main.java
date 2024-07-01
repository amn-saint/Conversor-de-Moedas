import java.util.Scanner;

public class Main {
    private static final String API_KEY = "5b0523e9c44c6f121468f4fd";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoeda conversor = new ConversorMoeda(API_KEY);
        Menu menu = new Menu(conversor);

        try {
            while (true){
                menu.exibirMenu();
                int opcode = Integer.parseInt(scanner.nextLine());
                if (opcode == 0) {
                    System.out.println("Finalizando Aplicação...");
                    return;
                }
                menu.processarOpcao(opcode);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
