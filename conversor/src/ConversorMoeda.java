import java.util.Scanner;

public class ConversorMoeda {
    private final CotacaoMoeda cotacaoMoeda;

    public ConversorMoeda (String apiKey) {
        this.cotacaoMoeda = new CotacaoMoeda(apiKey);
    }

    public void converterMoeda(String moedaDe, String moedaPara){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor em " + moedaDe + ": ");
            double valor = Double.parseDouble(scanner.nextLine());

            double taxa = cotacaoMoeda.obterTaxaDeCambio(moedaDe, moedaPara);
            double resultado = valor * taxa;
            System.out.println("Valor em " + moedaPara + ": " + resultado +"\n");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
