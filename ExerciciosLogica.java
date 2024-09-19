import java.util.Scanner;

public class ExerciciosLogica {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a questão que deseja resolver:");
        System.out.println("1 - Soma de variáveis em laço");
        System.out.println("2 - Verificar número na sequência de Fibonacci");
        System.out.println("3 - Cálculo de faturamento diário");
        System.out.println("4 - Percentual de representação por estado");
        System.out.println("5 - Inversão de string");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consome o newline

        switch (escolha) {
            case 1:
                somaVariaveis();
                break;
            case 2:
                fibonacciCheck(scanner);
                break;
            case 3:
                calculoFaturamento();
                break;
            case 4:
                percentualFaturamento();
                break;
            case 5:
                inversaoString(scanner);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    // Função da questão 1
    public static void somaVariaveis() {
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("Resultado da soma: " + SOMA);
    }

    // Função da questão 2
    public static void fibonacciCheck(Scanner scanner) {
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, c = 0;
        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == num || num == 0;
    }

    // Função da questão 3
    public static void calculoFaturamento() throws Exception {
        // Código simplificado para fins de exemplo (a lógica JSON/XML deve ser adaptada conforme os dados de faturamento)
        double[] faturamentos = {1200.50, 3400.75, 4500.10, 0, 0, 2300.50, 500.50}; // Exemplo de valores
        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE, soma = 0;
        int diasComFaturamento = 0, diasAcimaDaMedia = 0;

        for (double faturamento : faturamentos) {
            if (faturamento == 0) continue;
            if (faturamento < menor) menor = faturamento;
            if (faturamento > maior) maior = faturamento;
            soma += faturamento;
            diasComFaturamento++;
        }

        double media = soma / diasComFaturamento;
        for (double faturamento : faturamentos) {
            if (faturamento > media) diasAcimaDaMedia++;
        }

        System.out.println("Menor faturamento: " + menor);
        System.out.println("Maior faturamento: " + maior);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }

    // Função da questão 4
    public static void percentualFaturamento() {
        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
        double total = sp + rj + mg + es + outros;

        System.out.println("Percentual de SP: " + (sp / total) * 100 + "%");
        System.out.println("Percentual de RJ: " + (rj / total) * 100 + "%");
        System.out.println("Percentual de MG: " + (mg / total) * 100 + "%");
        System.out.println("Percentual de ES: " + (es / total) * 100 + "%");
        System.out.println("Percentual de Outros: " + (outros / total) * 100 + "%");
    }

    // Função da questão 5
    public static void inversaoString(Scanner scanner) {
        System.out.print("Informe uma string: ");
        String str = scanner.nextLine();

        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }

        System.out.println("String invertida: " + invertida);
    }
}
