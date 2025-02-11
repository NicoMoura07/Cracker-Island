package Projeto;

import java.util.Arrays;
import java.util.Scanner;

public class MathHelper{

    public void menu(){
        System.out.println("\n\nEscolha uma opção:");
        System.out.println("1- Próximo número\n2- Juntar nome e sobrenome");
        System.out.println("3- Maior número\n4- Somar números");
        System.out.println("5- Média dos números\n0- Sair\n");
    }

    public int numeroSeguinte(int n1){
        return n1 + 1;
    }
    public String Juntar(String nome, String sobrenome){
        return nome + " " + sobrenome;
    }
    public double Maior(double[] n2){
        Arrays.sort(n2);
        return n2[n2.length - 1];
    }
    public double Soma(double[] n2, int n1){
        double valor = 0;

        for (int n0 = 0; n0 < n1; n0++){
            valor += n2[n0];
        }
        return valor;
    }
    public double Media(double[] n2, int n1){
        return Soma(n2, n1) / n1;
    }
}