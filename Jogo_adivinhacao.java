import java.util.Random;
import java.util.Scanner;

public class Jogo_adivinhacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            int n_Random = random.nextInt(100) + 1;
            int n_tentativas = 0;
            int limiteTentativas = 10;
            int numero = 0;

            System.out.println("Chute um Número entre 1 e 100:");

            while (n_tentativas < limiteTentativas && numero != n_Random) {
                numero = ler.nextInt();
                n_tentativas++;

                if (numero < n_Random) {
                    System.out.println("O número é MAIOR que " + numero);
                } else if (numero > n_Random) {
                    System.out.println("O número é MENOR que " + numero);
                } else {
                    System.out.println("Muito Bem!!! Você acertou o número em " + n_tentativas + " tentativas!");
                }

                if (n_tentativas == limiteTentativas && numero != n_Random) {
                    System.out.println("Que Pena, você atingiu o limite de tentativas :( O número era " + n_Random);
                }
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            char resposta = ler.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                jogarNovamente = false;
            }
        }

        System.out.println("Obrigado por jogar! Até a próxima.");
        ler.close();
    }
}
