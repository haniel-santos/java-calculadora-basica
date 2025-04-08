package calculadorasimples;

import java.util.Scanner;
public class CalculadoraSimples {
    public static void main(String[] args) {
    int numero1, numero2, resultado;
    String operacao;
    Scanner s = new Scanner(System.in);
     
    System.out.println("Ditite o primeiro operando:");
    numero1 = s.nextInt();
    
    System.out.println("Ditite o segundo operando:");
    numero2 = s.nextInt();
    s.nextLine();
     
    System.out.println("Digite a operacao desejada:");
    operacao = s.nextLine();
     
     switch (operacao) {
         case "+":
             resultado = numero1 + numero2;
             break;
         case "-":
             resultado = numero1 - numero2;
             break;
         case "/":
             resultado = numero1 / numero2;
             break;
         case "*":
             resultado = numero1 * numero2;
             break;
         default:
             // criar logica para o caso de operacao invalida
             resultado = 0;
             break;
     }
        System.out.println("O resultado é:" + resultado);
    }
    
}
