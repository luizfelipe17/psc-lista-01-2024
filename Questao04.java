/*Faça um algoritmo que escreva “Olá, Mundo” na tela do console.
Utilize a linguagem Java para isso.

Faça um algoritmo que leia o seu nome e escreva o seu nome no console.

Faça um algoritmo que leia o seu nome, idade e altura.
Após isso imprima esses dados no console.

*/

package com.mycompany.psc.lista012024;
import java.util.*;

public class Questao04 {

    public static void main(String[] args) {
        System.out.println("Olá, Mundo\n");
        
        Scanner ler = new Scanner (System.in);
        
        String nome;
        int idade;
        double altura;
        
        System.out.print("Informe seu nome: ");
            nome = ler.nextLine();
        System.out.print("Informe sua idade: ");
            idade = ler.nextInt();
        System.out.print("Informe sua altura (Metros): ");
            altura = ler.nextDouble();
            
         
         System.out.print("\n\nSuas informções\n"
                 + "Nome: "+nome+"\n"
                         + "idade: "+idade+" anos\n"
                                 + "Altura: "+altura+"m");
            
            
    }
}
