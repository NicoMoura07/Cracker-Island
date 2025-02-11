package Projeto;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        MathHelper objeto = new MathHelper();

        Scanner scanner = new Scanner(System.in);

        int escolha;
        int n1;
        double resultado;
        String nome, sobrenome, completo;

        do {
            objeto.menu();
            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha < 0 || escolha > 5){
                System.out.println("Opção inválida, tente novamente");
            }

            if (escolha == 1) {
                System.out.println("Insira um número");
                n1 = scanner.nextInt();
                n1 = objeto.numeroSeguinte(n1);
                System.out.println("O número seguinte a este é " + n1);
            }
            else if (escolha == 2) {
                System.out.println("Insira seu nome e sobrenome");
                nome = scanner.nextLine();
                sobrenome = scanner.nextLine();
                completo = objeto.Juntar(nome, sobrenome);
                System.out.println("Seu nome é " + completo);
            }
            else if (escolha > 2 && escolha < 6) {
                System.out.println("Insira a quantidade de números");
                n1 = scanner.nextInt();

                double[] n2 = new double[n1];

                System.out.println("Insira os números");
                for (int i = 0; i < n1; i++) {
                    n2[i] = scanner.nextDouble();
                }

                if (escolha == 3) {
                    resultado = objeto.Maior(n2);
                    System.out.println("O maior número é " + resultado);
                }
                if (escolha == 4) {
                    resultado = objeto.Soma(n2, n1);
                    System.out.println("O soma dos números é " + resultado);
                }
                if (escolha == 5) {
                    resultado = objeto.Media(n2, n1);
                    System.out.println("A média dos números é " + resultado);
                }
            }
        }while (escolha != 0);

        if (escolha == 0){
            System.out.println("\nA sair...");
        }
        scanner.close();
    }
}