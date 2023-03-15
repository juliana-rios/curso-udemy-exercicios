package Exeercicios;

import java.util.Scanner;

public class Ex6_Intervalo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num;

        System.out.println("Digite um número: ");
        num = scan.nextDouble();

        if(num > 0.0 && num <= 25.0){
            System.out.println("Intervalo [0,25]");
        }else if (num > 25.0 && num <= 50.0){
            System.out.println("Intervalo [25,50]");
        }else if (num > 50 && num <= 75){
            System.out.println("Intervalo [50,75]");
        } else if (num > 75 && num <= 100) {
            System.out.println("Intervalo [75,100]");
        }else {
            System.out.println("Fora do intervalo!");
        }
    }
}
