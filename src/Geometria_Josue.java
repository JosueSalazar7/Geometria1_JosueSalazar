import java.util.Scanner;

public class Geometria_Josue{
    Scanner sc = new Scanner(System.in);
    private double area;
    private double perimetro;

    private double volumen;

    public Geometria_Josue(){
        area = 0;
        perimetro = 0;
        volumen = 0;
    }
    private double getArea() {
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    private double getPerimetro() {
        return perimetro;
    }

    private void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    private double getVolumen() {
        return volumen;
    }

    private void setVolumen(double volumen) {
        this.volumen = volumen;
    }



    private double num1, num2, num3, resultado, pi=3.24;
    public void areacuadrado(){
        System.out.print("\nIngrese el lado del cuadrado: ");
        num1 = sc.nextDouble();
        resultado = num1 * num1;
        setArea(resultado);
        System.out.println("\nEl area del cuadrado es: " + getArea());
    }
    public void arearectangulo(){
        System.out.print("\nIngrese la base del rectangulo: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        num2 = sc.nextDouble();
        resultado = num1 * num2;
        setArea(resultado);
        System.out.println("\nEl area del rectangulo es: " + getArea());
    }
    public void areatriangulo(){
        System.out.print("\nIngrese la base del triangulo: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese la atlura del triangulo: ");
        num2 = sc.nextDouble();
        resultado = (num1 * num2) / 2;
        setArea(resultado);
        System.out.println("\nEl area del triangulo es: " + getArea());
    }
    public void areacirculo(){
        System.out.print("\nIngrese el radio del circulo: ");
        num1 = sc.nextDouble();
        resultado = 3.14 * (num1 * num1);
        setArea(resultado);
        System.out.println("\nEl area del circulo es: " + getArea());
    }
    public void perimetrocuadrado(){
        System.out.print("\nIngrese el lado del cuadrado: ");
        num1 = sc.nextDouble();
        resultado = num1 + num1 + num1 + num1;
        setPerimetro(resultado);
        System.out.println("El perimetro del cuadrado es: " + getPerimetro());
    }
    public void perimetrorectangulo(){
        System.out.print("Ingrese la base del rectangulo: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese la altura rectangulo: ");
        num2 = sc.nextDouble();
        resultado = 2 * (num1 + num2);
        setPerimetro(resultado);
        System.out.println("\nEl perimtero del rectangulo es: " + getPerimetro());

    }
    public void perimetrotriangulo(){
        System.out.print("\nIngrese el valor del primer lado: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese el valor del segundo lado: ");
        num2 = sc.nextDouble();
        System.out.print("Ingrese el valor del tercer lado: ");
        num3 = sc.nextDouble();
        resultado = num1 + num2 + num3;
        setPerimetro(resultado);
        System.out.println("\nEl perimetro del triangulo es: " + getPerimetro());
    }
    public void perimetrocirculo(){
        System.out.print("\nIngrese el valor del radio: ");
        num1 = sc.nextDouble();
        resultado = 2 * 3.14 * num1;
        setPerimetro(resultado);
        System.out.println("\nEl perimetro del circulo es: " + getPerimetro());
    }

}
