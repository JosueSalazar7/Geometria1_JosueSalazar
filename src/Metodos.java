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
    double perimetrocuadrado(double num1, double resultado){
        System.out.print("\nIngrese el lado del cuadrado: ");
        num1 = sc.nextDouble();
        resultado = num1 + num1 + num1 + num1;
        g.setPerimetro(resultado);
        System.out.println("El perimetro del cuadrado es: " + g.getPerimetro());
        return resultado;
    }
    double perimetrorectangulo(double num1, double num2, double resultado){
        System.out.print("Ingrese la base del rectangulo: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese la altura rectangulo: ");
        num2 = sc.nextDouble();
        resultado = 2 * (num1 + num2);
        g.setPerimetro(resultado);
        System.out.println("\nEl perimtero del rectangulo es: " + g.getPerimetro());
        return resultado;
    }
    double perimetrotriangulo(double num1,double num2, double num3,double resultado){
        System.out.print("\nIngrese el valor del primer lado: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese el valor del segundo lado: ");
        num2 = sc.nextDouble();
        System.out.print("Ingrese el valor del tercer lado: ");
        num3 = sc.nextDouble();
        resultado = num1 + num2 + num3;
        g.setPerimetro(resultado);
        System.out.println("\nEl perimetro del triangulo es: " + g.getPerimetro());
        return resultado;
    }
    double perimetrocirculo(double num1, double resultado){
        System.out.print("\nIngrese el valor del radio: ");
        num1 = sc.nextDouble();
        resultado = 2 * 3.14 * num1;
        g.setPerimetro(resultado);
        System.out.println("\nEl perimetro del circulo es: " + g.getPerimetro());
        return resultado;
    }
}
