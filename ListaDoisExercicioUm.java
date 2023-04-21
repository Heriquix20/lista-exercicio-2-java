package ListaDoisExercicios;

import java.util.Scanner;
    
public class ListaDoisExercicioUm {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int num1, num2, num3, media, maior, menor;

    System.out.println("\nDigite um número: ");
    num1 = scanner.nextInt();
    
    System.out.println("\nDigite um número: ");
    num2 = scanner.nextInt();

    System.out.println("\nDigite um número: ");
    num3 = scanner.nextInt();

    maior = num1;
    menor = num1;
    media = (num1 + num2 + num3) /3;

    if (num2 > maior) {
        maior = num2;
    }
    if (num3 > maior) {
        maior = num3;
    }

    if ( num2 < menor) {
         menor = num2;
    }
    if (num3 < menor) {
        menor = num3;
    }

   System.out.println("\nO maior número é: " + maior);
   System.out.println("\nO menor número é: " + menor);
   System.out.println("\nA média artitimetica dos três números são: " + media);
}
}  


