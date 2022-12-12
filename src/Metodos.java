import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    Geometria_Josue g = new Geometria_Josue();

    private double num1, num2, num3, resultado, pi=3.24;
   public void areacuadrado(){
        System.out.print("\nIngrese el lado del cuadrado: ");
        num1 = sc.nextDouble();
        resultado = num1 * num1;
        g.setArea(resultado);
        System.out.println("\nEl area del cuadrado es: " + g.getArea());
    }
    public void arearectangulo(){
        System.out.print("\nIngrese la base del rectangulo: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        num2 = sc.nextDouble();
        resultado = num1 * num2;
        g.setArea(resultado);
        System.out.println("\nEl area del rectangulo es: " + g.getArea());
    }
    public void areatriangulo(){
        System.out.print("\nIngrese la base del triangulo: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese la atlura del triangulo: ");
        num2 = sc.nextDouble();
        resultado = (num1 * num2) / 2;
        g.setArea(resultado);
        System.out.println("\nEl area del triangulo es: " + g.getArea());
    }
    public void areacirculo(){
        System.out.print("\nIngrese el radio del circulo: ");
        num1 = sc.nextDouble();
        resultado = 3.14 * (num1 * num1);
        g.setArea(resultado);
        System.out.println("\nEl area del circulo es: " + g.getArea());
    }
    public void perimetrocuadrado(){
        System.out.print("\nIngrese el lado del cuadrado: ");
        num1 = sc.nextDouble();
        resultado = num1 + num1 + num1 + num1;
        g.setPerimetro(resultado);
        System.out.println("El perimetro del cuadrado es: " + g.getPerimetro());
    }
    public void perimetrorectangulo(){
        System.out.print("Ingrese la base del rectangulo: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese la altura rectangulo: ");
        num2 = sc.nextDouble();
        resultado = 2 * (num1 + num2);
        g.setPerimetro(resultado);
        System.out.println("\nEl perimtero del rectangulo es: " + g.getPerimetro());

    }
    public void perimetrotriangulo(){
        System.out.print("\nIngrese el valor del primer lado: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese el valor del segundo lado: ");
        num2 = sc.nextDouble();
        System.out.print("Ingrese el valor del tercer lado: ");
        num3 = sc.nextDouble();
        resultado = num1 + num2 + num3;
        g.setPerimetro(resultado);
        System.out.println("\nEl perimetro del triangulo es: " + g.getPerimetro());
    }
    public void perimetrocirculo(){
        System.out.print("\nIngrese el valor del radio: ");
        num1 = sc.nextDouble();
        resultado = 2 * 3.14 * num1;
        g.setPerimetro(resultado);
        System.out.println("\nEl perimetro del circulo es: " + g.getPerimetro());
    }
}
