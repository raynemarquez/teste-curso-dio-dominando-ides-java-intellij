package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite o primeiro valor:");
        num1= scan.nextDouble();
        System.out.println("Digite o segundo valor:");
        num2= scan.nextDouble();

        double soma = somar(num1, num2);
        double subtracao = subtrair(num1, num2);
        double multiplicacao = multiplicar(num1, num2);
        double divisao = dividir(num1, num2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
    }

    public static double somar(double num1, double num2){
        return num1 + num2;
    }
    public static double subtrair(double num1,double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1,double num2){
        return num1 * num2;
    }
    public static double dividir(double num1,double num2){
        return num1 / num2;
    }
}
