import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter("YOUR_API_KEY");

        System.out.println("Digite o valor a ser convertido:");
        double valor = scanner.nextDouble();

        System.out.println("Digite a moeda de origem (ex: USD):");
        String origem = scanner.next().toUpperCase();

        System.out.println("Digite a moeda de destino (ex: BRL):");
        String destino = scanner.next().toUpperCase();

        double resultado = converter.convert(valor, origem, destino);
        System.out.println("Valor convertido: " + resultado);
    }
}
