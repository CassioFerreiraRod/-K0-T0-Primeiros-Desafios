public class FatoresPrimos {

    public static void main(String[] args) {
        long n = 600851475143L;

        // Loop para encontrar os fatores primos
        for (long i = 2; i < n; i++) {
            // Verifica se i é um fator primo
            while (n % i == 0) {
                // Se i é um fator primo, divide n por i
                n = n / i;
            }

        }

        // O que restar em n após o loop é o maior fator primo
        System.out.println(n);
    }
}
