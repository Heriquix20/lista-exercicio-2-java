package ListaDoisExercicios;

import java.util.Scanner;

public class ListaDoisExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double numero1, numero2, soma, subtracao, multiplicar, dividir, conta;
        int operacao;

        System.out.println("\nEscolha um dos símbolos:\n [1]: + \n [2]: - \n [3]: * \n [4]: / \n [5]: ^ ");
        operacao = scanner.nextInt();

        if (operacao > 5) {
            System.out.println("\nO código da operação digitado é inválido! ");
        }
        else {
         System.out.println("\nDigite o primeiro número: ");
        numero1 = scanner.nextDouble();
        System.out.println("\nDigite o segundo número: ");
        numero2 = scanner.nextDouble();

        conta = Math.pow(numero1, numero2);
        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicar = numero1 * numero2;
        dividir = numero1/numero2;

        switch (operacao) {
            case 1:
            System.out.println("\nA soma dos dois números é: " + soma);
            break;
            case 2:
            System.out.println("\nA subtração dos dois números é: " + subtracao);
            break;
            case 3:
            System.out.println("\nA multiplicação dos dois números é: " + multiplicar);
            break;
            case 4:
            System.out.println("\nA divisão dos dois números é: " + dividir);
            break;
            case 5:
            System.out.println("\nA potência dos dois números é: " + conta);
            break;  
            } 
        }
    }
}
    

