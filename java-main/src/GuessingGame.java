import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    int guess = 0;
    int tries = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem-vindo ao jogo de adivinhação!");
    System.out.println("Eu pensei em um número entre 1 e 100. Tente adivinhar qual é!");

    while (guess != number) {
      System.out.print("Digite seu palpite: ");
      guess = scanner.nextInt();
      tries++;

      if (guess < number) {
        System.out.println("Seu palpite é muito baixo. Tente novamente.");
      } else if (guess > number) {
        System.out.println("Seu palpite é muito alto. Tente novamente.");
      } else {
        System.out.println("Parabéns! Você acertou o número em " + tries + " tentativas.");
      }
    }

    scanner.close();
  }
}
