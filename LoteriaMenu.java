import java.util.Random;
import java.util.Scanner;

public class LoteriaMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcao;
        do {
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número de 0 a 100: ");
                    int numeroAposta = scanner.nextInt();
                    if (numeroAposta < 0 || numeroAposta > 100) {
                        System.out.println("Aposta inválida.");
                        break;
                    }
                    int numeroSorteado = random.nextInt(101);
                    if (numeroAposta == numeroSorteado) {
                        System.out.println("Você ganhou R$ 1.000,00 reais.");
                    } else {
                        System.out.println("Que pena! O número sorteado foi: " + numeroSorteado + ".");
                    }
                    break;
                case 2:
                    System.out.print("Digite uma letra de A à Z: ");
                    String entrada = scanner.next();
                    if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                        System.out.println("Aposta inválida.");
                        break;
                    }
                    char letraAposta = Character.toUpperCase(entrada.charAt(0));
                    char letraPremiada = 'R';
                    if (letraAposta == letraPremiada) {
                        System.out.println("Você ganhou R$ 500,00 reais.");
                    } else {
                        System.out.println("Que pena! A letra sorteada foi: " + letraPremiada + ".");
                    }
                    break;
                case 3:
                    System.out.print("Digite um número inteiro: ");
                    int numero = scanner.nextInt();
                    if (numero % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
