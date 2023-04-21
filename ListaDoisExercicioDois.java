package ListaDoisExercicios;

import java.util.Scanner;

public class ListaDoisExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorCompra, valorPago, troco;
        int cinquenta, vinte, dez, cinco, dois, um;

        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextInt();

        System.out.print("Digite o valor pago: ");
        valorPago = scanner.nextInt();

        troco = valorPago - valorCompra;

        System.out.println("Troco: " + troco);


        cinquenta = troco / 50;
        troco = troco % 50;

        vinte = troco / 20;
        troco = troco % 20;

        dez = troco / 10;
        troco = troco % 10;

        cinco = troco / 5;
        troco = troco % 5;

        dois = troco / 2;
        troco = troco % 2;

        um = troco / 1;
        troco = troco % 1;

        System.out.println("Quantidade de notas:");
        System.out.println(cinquenta + " notas de R$ 50");
        System.out.println(vinte + " notas de R$ 20");
        System.out.println(dez + " notas de R$ 10");
        System.out.println(cinco + " notas de R$ 5");
        System.out.println(dois + " notas de R$ 2");
        System.out.println(um + " notas de R$ 1");
    }
}




       