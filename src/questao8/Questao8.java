/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao8;

import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class Questao8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaA = new Scanner(System.in);
        Scanner entradaB = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número - ");
        int numA = entradaA.nextInt();
        System.out.println("Digite o segundo número - ");
        int numB = entradaB.nextInt();
        System.out.println("Saída - "+saida(numA, numB)); // retorna a saída
    }
    
    private static int saida(int numA, int numB){

        StringBuilder builder = new StringBuilder();

        char[] numAString = Integer.valueOf(numA).toString().toCharArray();
        char[] numBString = Integer.valueOf(numB).toString().toCharArray();

        int max = numAString.length >= numBString.length ? numAString.length : numBString.length;

        for (int i = 0; i < max; i++) {

            if (numAString.length > i) {
                builder.append(numAString[i]);
            }

            if (numBString.length > i) {
                builder.append(numBString[i]);
            }
        }

        Integer retorno = Integer.valueOf(builder.toString());

        if (retorno > 1000000) {
            return -1;
        }

        return retorno;
    }
}
