package Atv11;
import java.util.Scanner;

public class Atv1{
    public static void main(String[] args) {
            ContasAtv1 contas = new ContasAtv1();
            Scanner scanner = new Scanner(System.in);
        
            double n1,n2;
            String cont;

    do{
            System.out.println("Escolha uma operação: \n1(+) \t2(-) \t3(*) \t4(/) \t5(^) \t6(√) \nResposta: ");
            int op = scanner.nextInt();

        if(op >= 1 && op <= 5){
            System.out.println("Escreva 1 numeros: ");
            n1 = scanner.nextDouble();
            System.out.println("Escreva +1 numeros: ");
            n2 = scanner.nextDouble();

        
       switch (op) {
        case 1:
            System.out.println("A soma é " + contas.soma(n1, n2));
            break;
        case 2: 
            System.out.println("A sub é " + contas.sub(n1, n2));
            break;
        case 3: 
            System.out.println("A multi é " + contas.mult(n1, n2));
            break;
        case 4: 
            if(n2 == 0){
                System.out.println("Impossível realizar uma divisão por zero.");
            }else
            System.out.println("A divisão é " + contas.div(n1, n2));
            break;
        case 5: 
            if(n2 == 0){
            System.out.println("A potencia é 1");
            }else
            System.out.println("A potencia é " + contas.pot(n1, n2));
       }
        
        }else{
            System.out.println("Escreva 1 numeros: ");
            n1 = scanner.nextDouble();
        }

    //raiz
        if(op == 6)
            if(n1 < 0){
            System.out.println("Não existe raiz de número negativo.");
            }else
            System.out.println("A raiz é " + contas.raiz(n1));

        System.out.println("Deseja fazer outra conta? \nSe sim digite (R), se não digite (Q)");   
            cont = scanner.next();
        }while(cont.equalsIgnoreCase("R"));
        
        if(cont.equalsIgnoreCase("Q")){
         System.exit(0);
        }
                
       scanner.close();     
     }  
}