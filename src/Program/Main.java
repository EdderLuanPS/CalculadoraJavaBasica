package Program;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args){
    
        double n1, n2, soma, subtracao, divisao, multiplicacao;
        int sinal; 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("escreva um número // write a number");
        n1 = scanner.nextDouble();
        
        System.out.println("escolha a operação // pick the operation"
                + "\n 1- soma // plus"
                + "\n 2- subtração // minus"
                + "\n 3- multiplicação // times"
                + "\n 4- divisão // divided by");
        sinal = scanner.nextInt();
        
        System.out.println("escreva outro número // write another number");
        n2 = scanner.nextDouble();
        
        switch(sinal){
            
            case 1:   
                soma = n1+n2;
                System.out.println(soma);
            break;
            
            case 2:    
                subtracao = n1-n2;
                System.out.println(subtracao);
            break;
            
            case 3:    
                multiplicacao = n1/n2;
                System.out.println(multiplicacao);
            break;
            
            case 4:    
                divisao = n1*n2;
                System.out.println(divisao);
            break;
        }
        
    }
    
}
