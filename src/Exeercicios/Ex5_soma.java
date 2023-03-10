package Exeercicios;

import java.util.Scanner;

public class Ex5_soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codigo_item;
        int quantidade_item;
        double total = 0;

        System.out.println("Digite o código do item de 1 a 5: ");
        codigo_item = scan.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidade_item = scan.nextInt();

        if(codigo_item == 1){
          total =  4 * quantidade_item;
        }else if (codigo_item == 2){
            total = 4.50 * quantidade_item;
        } else if (codigo_item == 3) {
            total = 5 * quantidade_item;
        }else if (codigo_item == 4){
            total = 2 * quantidade_item;
        }else if (codigo_item == 5){
            total = 1.50 * quantidade_item;
        }else {
            System.out.println("Opção inválida");
        }
        System.out.printf("Total: R$ %.2f", total);
    }
}
