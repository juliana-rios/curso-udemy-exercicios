package Exeercicios;

import java.util.Scanner;

public class Ex3_multiplos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = scan.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0){
            System.out.println("São multiplos");
        }else {
            System.out.println("Não são multiplos");
        }

    }
}
