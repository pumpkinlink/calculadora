package grupo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        double a = scanner.nextDouble();
        System.out.println("digite o segundo numero");
        double b = scanner.nextDouble();
        System.out.println("Soma: " + somar(a, b));
        System.out.println("Subtração: " + subtrair(a, b));
        System.out.println("Divisão: " + dividir(a, b));
        System.out.println("Multiplicação: " + multiplicar(a, b));
    }

    static public double somar(double a, double b) {
        return a + b;
    }

    static public double subtrair(double a, double b) {
        return a - b;
    }

    static public double dividir(double a, double b) {
        return a / b;
    }

    static public double multiplicar(double a, double b) {
        return a * b;
    }
}
