import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int limite = 4000000;
        int soma = 0;

        // Inicializando os dois primeiros termos da sequência
        int a = 1;
        int b = 1;

        // Loop para calcular os termos da sequência e somar os valores pares
        while (b < limite) {
            // Verificando se o termo atual (b) é par
            if (b % 2 == 0) {
                soma += b;
            }

            // Calculando o próximo termo da sequência
            int c = a + b;
            // Atualizando os valores dos termos anteriores
            a = b;
            b = c;

        }

        System.out.println("A soma dos termos pares da sequência de Fibonacci até " + limite + " é: " + soma);

    }
}