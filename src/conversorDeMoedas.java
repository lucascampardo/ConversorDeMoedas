import java.util.Scanner;

public class conversorDeMoedas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double euro = 5.60, dolar = 4.90, valorReais, conversao;
        int op;

        System.out.printf("Informe o valor em reais: ");
        valorReais = scan.nextDouble();

        System.out.printf("1 - Euro | 2 - Dolar? ");
        op = scan.nextInt();

        switch(op) {
            case 1:
                conversao = valorReais / euro;
                System.out.printf("Valor em Euro = %.2f", conversao);
                break;

            case 2:
                conversao = valorReais / dolar;
                System.out.printf("Valor em dolar = %.2f", conversao);
                break;
        }

        scan.close();
    }

}
