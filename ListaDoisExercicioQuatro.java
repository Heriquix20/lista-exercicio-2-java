package ListaDoisExercicios;

import java.util.Scanner;

public class ListaDoisExercicioQuatro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double raio, perimetro, area, volume;
        int indicador;
        System.out.println("\nEscolha um número das opções abaixo: \n 1-[Perímetro] \n 2-[Área] \n 3-[Volume]");
        indicador = scanner.nextInt();
        System.out.println("\nDigite o raio da esfera: ");
        raio = scanner.nextDouble();

        perimetro = (2 * 3.141592) * raio;
        area = 3.141592 * Math.sqrt(raio);
        volume = 4/3 * 3.141592 * Math.cbrt(raio);

        switch (indicador) {
            case 1:
            System.out.println("\nO perímetro do círculo é: " + perimetro);
            break;
            case 2:
            System.out.println("\nA área do círculo é: " + area);
            break;
            case 3:
            System.out.println("\nO volume da esfera é: " + volume);
            break;
            default:
            System.out.println("\nErro!! Código da operação inválido");       
        }
    }
}
