//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Multiplos {
    public static void main(String[] args) {
        int soma = 0;
        // loop que percorre números entre 1 e 1000
        for (int i = 1; i < 1000; i++) {
            // condição que verifica se são múltiplos de 3 ou 5
            if (i % 3 == 0 || i % 5 == 0){
                // faz a soma dos múltiplos
                soma += i;
            }
        }
        System.out.println("A soma de todos dos míltiplos de 3 e 5 abaixo de 1000 é: " + soma);
    }
}