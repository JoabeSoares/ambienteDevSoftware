package trabalho;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        

        // Solicita o primeiro número do cálculo
        System.out.println("Digite o primeiro número da soma: ");
        int numero1 = scanner.nextInt();
        
        // Solicita o segundo número do cálculo
        System.out.println("Digite o segundo número da soma: ");
        int numero2 = scanner.nextInt();
        
        // Especifica a operação de soma que será executada
        int soma = numero1 + numero2;

        // Imprime o resultado da soma
        System.out.printf("A soma entre %d e %d é igual a %d.", numero1, numero2 ,soma);




        scanner.close();
    }


}
    



    