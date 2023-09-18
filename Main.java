import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Random random = new Random();

        do {
            System.out.println("--ESCOLHA A FORMA DE APOSTA--");
            System.out.println("-----------------------------");
            System.out.println(" 01 - APOSTAR DE 0 A 100");
            System.out.println(" 02 - APOSTAR DE A Á Z");
            System.out.println(" 03 - APOSTAR EM PAR OU IMPÁR");
            System.out.println(" 00 - SAIR");
            System.out.println("----------------------------");
            System.out.println("DIGITE A OPÇÃO :");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                        System.out.println("Você escolheu apostar de 0 a 100.\nDIGITE UM NUMERO DE 0 A 100");
                        int num;
                        int numAleatorio = random.nextInt(101);
                        num = scanner.nextInt();
                        if (num < 0 || num >100) {
                        System.out.println("APOSTA INVALIDA \n");
                        }else if (num==numAleatorio){
                        System.out.println("Parabens! Você ganhou R$ 1.000,00.");
                        }else {
                        System.out.println("Que pena! O número sorteado foi: "+numAleatorio );
                        }
                        break;
                case 2:
                    try {
                        System.out.print("Você escolheu apostar em A á Z.\nDIGITE UMA LETRA DE A Á Z: ");
                        int input = System.in.read();
                        char letraEscolhida = (char) input;
                        letraEscolhida = Character.toUpperCase(letraEscolhida);
                        char letraPremiada = 'J';

                        if (Character.isLetter(letraEscolhida)) {
                            if (letraPremiada == letraEscolhida) {
                                System.out.println("Parabéns! Você ganhou R$500,00.");
                            } else {
                                System.out.println("Que pena! A letra sorteada foi: " + letraPremiada + ".");
                            }
                        } else {
                            System.out.println("Aposta inválida.");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                        System.out.println("Você escolheu apostar em par ou ímpar.\nDIGITE O NÚMERO PAR OU IMPÁR");
                        int num1;
                        num1 = scanner.nextInt();
                        if (num1%2==0) {
                            System.out.println("Parabens! Você ganhou R$ 100,00.");
                        }else {
                            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                        }
                    break;
                case 0:
                        System.out.println("SAINDO");
                    break;
                default:
                        System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
