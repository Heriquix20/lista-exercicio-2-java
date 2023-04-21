package ListaDoisExercicios;
import java.util.Scanner;
import java.util.Random;

public class ListaDoisExercicioSeis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, nSorteado, divisao, maior, menor;

        System.out.println("\nDigite um número: ");
        numero1 = scanner.nextInt();
        System.out.println("\nDigite outro número: ");
        numero2 = scanner.nextInt();

        maior = numero1;
        menor = numero1;

        if (numero1 > numero2) {
             maior = numero1;
             menor= numero2;
        }
        else {
            maior = numero2;
            menor = numero1;
        }

        System.out.println("\nO maior número é: " + maior);
        System.out.println("\nO menor número é: " + menor);


    Random gerator = new Random();
        nSorteado = gerator.nextInt(menor,maior);
        System.out.println("\nO número aleatório é: " + nSorteado);

        if (nSorteado %2 == 0) {
            System.out.println("\nO número aleatório é PAR ");
        }
        else {
            System.out.println("\nO número aleatório é ÍMPAR ");
        }
        scanner.close();
    }   
} 

