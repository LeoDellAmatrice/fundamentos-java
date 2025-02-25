/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fundamentos.java;

public class FundamentosJava {

    public static void main(String[] args) {

        String aluno = "Francisco";

        float nota1 = 7;
        float nota2 = 8;

        float media = (nota1+nota2)/2;

        if (media >= 6) {
            System.out.println("Aprovado com media: "+media);
        } else {
            System.out.println("Reprovado com media: "+media);
        }
    }

}
