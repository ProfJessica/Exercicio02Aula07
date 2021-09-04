package exercicio02aula07;
import java.util.Scanner;

public class Exercicio02Aula07 {


    public static void main(String[] args) {
    // Construa em Java, um programa que receba o período do dia (M - matutino, 
    // V - vespertino ou N - noturno) e imprima a mensagem “Bom dia”, 
    // “Boa tarde” ou “Boa noite”, para a respectiva opção.
    
    Scanner input = new Scanner(System.in);
    System.out.println("Qual o período? ");
    String periodo = input.next();
    
    switch (periodo) {
        case "M":
        case "m":
        case "Matutino":
        case "matutino":
        case "dia":
            System.out.println("Bom dia!!!!");
            break;
        case "V":
        case "v":
            System.out.println("Boa tarde");
            break;
        case "N": 
            System.out.println("Boa noite");
            break;
        default:
            System.out.println("Erro!");
    }
    
    
    }
    
}
