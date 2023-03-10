package Exeercicios;

import java.util.Scanner;

public class Ex2_par {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        if ((num % 2) != 0){
            System.out.println("Este número é impar!");
        }else {
            System.out.println("Este número é par!");
        }
    }
}
