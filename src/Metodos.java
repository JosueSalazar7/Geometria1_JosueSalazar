import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    Geometria_Josue g = new Geometria_Josue();
    double areacuadrado(double num1, double resultado){
        System.out.print("\nIngrese el lado del cuadrado: ");
        num1 = sc.nextDouble();
        resultado = num1 * num1;
        g.setArea(resultado);
        System.out.println("\nEl area del cuadrado es: " + g.getArea());
        return resultado;
    }
    double arearectangulo(double num1, double num2, double resultado){
        System.out.print("\nIngrese la base del rectangulo: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        num2 = sc.nextDouble();
        resultado = num1 * num2;
        g.setArea(resultado);
        System.out.println("\nEl area del rectangulo es: " + g.getArea());
        return resultado;
    }
    double areatriangulo(double num1, double num2, double reasultado){
        System.out.print("\nIngrese la base del triangulo: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese la atlura del triangulo: ");
        num2 = sc.nextDouble();
        reasultado = (num1 * num2) / 2;
        g.setArea(reasultado);
        System.out.println("\nEl area del triangulo es: " + g.getArea());
        return reasultado;
    }
    double areacirculo(double num1, double resultado){
        System.out.print("\nIngrese el radio del circulo: ");
        num1 = sc.nextDouble();
        resultado = 3.14 * (num1 * num1);
        g.setArea(resultado);
        System.out.println("\nEl area del circulo es: " + g.getArea());
        return resultado;
    }
}
