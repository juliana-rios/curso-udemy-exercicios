package Exeercicios;

import java.util.Scanner;

public class Ex4_horas {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int hora_inicial;
        int hora_final;
        int resultado;

        System.out.println("Digite o horario de inicio do jogo: ");
        hora_inicial = scan.nextInt();
        System.out.println("Digite o horario final do jogo: ");
        hora_final = scan.nextInt();

        if (hora_inicial < hora_final){
            resultado= hora_inicial - hora_final;
        }else {
            resultado= 24 - hora_inicial + hora_final;
        }
        System.out.println("A quantidade de horas é: " + resultado);
    }
}
