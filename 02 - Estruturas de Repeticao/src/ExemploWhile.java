import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ExemploWhile {
    public static void main(String[] args) {
        // While
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce de valor " + valorDoce + " adicionado!");
            mesada = mesada - valorDoce;
        }
        System.out.println("Fim da mesada!\n");

        // Do While
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando...");
        } while (tocando());
        System.out.println("Finalmente... Alô!?");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
