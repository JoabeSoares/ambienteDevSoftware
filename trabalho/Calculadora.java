package trabalho;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu de escolher operações
        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        
        // Obtém a escolha do usuário
        System.out.print("Digite o número da operação desejada: ");
        int escolha = scanner.nextInt();

            // Variáveis para armazenar os números inseridos pelo usuário
            int numero1, numero2, resultado;

            switch (escolha) {
                case 1: // Soma
                    System.out.println("Digite o primeiro número: ");
                    numero1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    numero2 = scanner.nextInt();
                    resultado = numero1 + numero2;
                    System.out.printf("A soma entre %d e %d é igual a %d.%n", numero1, numero2, resultado);
                    break;
    
                case 2: // Subtração
                    System.out.println("Digite o primeiro número: ");
                    numero1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    numero2 = scanner.nextInt();
                    resultado = numero1 - numero2;
                    System.out.printf("A subtração entre %d e %d é igual a %d.%n", numero1, numero2, resultado);
                    break;
    
                case 3: // Multiplicação
                System.out.println("Digite o primeiro número: ");
                    numero1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    numero2 = scanner.nextInt();
                    resultado = numero1 * numero2;
                    System.out.printf("A multiplicação entre %d e %d é igual a %d.%n", numero1, numero2, resultado);
                    break;

                // Adicione casos para divisão (4) aqui
    
                default:
                    System.out.println("Operação inválida. Por favor, escolha um número de 1 a 4.");
            }
    
            scanner.close();
        }


}
    



    