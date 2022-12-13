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



    private double num1, num2, num3, resultado, pi=3.14;
    public void areacuadrado(){
           do {
               System.out.print("\nIngrese el lado del cuadrado: ");
               num1 = sc.nextDouble();
               if(num1 < 0){
                   System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
               }
           }while(num1 < 0);
               resultado = num1 * num1;
               setArea(resultado);
               System.out.println("\nEl area del cuadrado es: " + getArea());


    }
    public void arearectangulo(){
        do {
            System.out.print("\nIngrese la base del rectangulo: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while (num1 < 0);
        do {
            System.out.print("Ingrese la altura del rectangulo: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num2 < 0);
        resultado = num1 * num2;
        setArea(resultado);
        System.out.println("\nEl area del rectangulo es: " + getArea());
    }
    public void areatriangulo(){
        do {
        System.out.print("\nIngrese la base del triangulo: ");
        num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while (num1 < 0);
        do {
            System.out.print("Ingrese la atlura del triangulo: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while (num2 <0);
        resultado = (num1 * num2) / 2;
        setArea(resultado);
        System.out.println("\nEl area del triangulo es: " + getArea());
    }
    public void areacirculo(){
        do {
            System.out.print("\nIngrese el radio del circulo: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num1 < 0);
        resultado = 3.14 * (num1 * num1);
        setArea(resultado);
        System.out.println("\nEl area del circulo es: " + getArea());
    }
    public void perimetrocuadrado(){
        do {
            System.out.print("\nIngrese el lado del cuadrado: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num1 < 0);
        resultado = num1 + num1 + num1 + num1;
        setPerimetro(resultado);
        System.out.println("El perimetro del cuadrado es: " + getPerimetro());
    }
    public void perimetrorectangulo(){
        do {
            System.out.print("Ingrese la base del rectangulo: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num1 < 0);
        do {
            System.out.println("Ingrese la altura rectangulo: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num2 < 0);
        resultado = 2 * (num1 + num2);
        setPerimetro(resultado);
        System.out.println("\nEl perimtero del rectangulo es: " + getPerimetro());

    }
    public void perimetrotriangulo(){
        do {
            System.out.print("\nIngrese el valor del primer lado: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num1 < 0);
        do {
            System.out.print("Ingrese el valor del segundo lado: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num2 < 0);
        do {
            System.out.print("Ingrese el valor del tercer lado: ");
            num3 = sc.nextDouble();
            if(num3 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num3 < 0);
        resultado = num1 + num2 + num3;
        setPerimetro(resultado);
        System.out.println("\nEl perimetro del triangulo es: " + getPerimetro());
    }
    public void perimetrocirculo() {
        do {
            System.out.print("\nIngrese el valor del radio: ");
            num1 = sc.nextDouble();
            if (num1 < 0) {
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while (num1 < 0) ;
            resultado = 2 * 3.14 * num1;
            setPerimetro(resultado);
            System.out.println("\nEl perimetro del circulo es: " + getPerimetro());
        }
        public  void volumencuadrado(){
            do {
                System.out.print("\nIngrese el lado del cuadrado: ");
                num1 = sc.nextDouble();
                if(num1 < 0){
                    System.out.println("\nEl dato ingresado es incorrecto ingrese nuevamente por favor");
                }
            }while(num1 < 0);
            resultado = num1 * num1 * num1;
            setVolumen(resultado);
            System.out.println("\nEl del volumen del cubo es: " + getVolumen());
        }
        public void volumenrectangulo(){
        do {
            System.out.print("\nIngrese el valor del largo del rectangulo: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl valor ingresado es incorrecto ingrese nuevamente por favor");
            }
        }while (num1 < 0);
        do {
            System.out.print("Ingrese el ancho del rectangulo: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl valor ingresado es incorrecto ingrese nuevamente por favor");
            }
        }while(num2 < 0);
        do{
            System.out.print("Ingrese la altura del resctangulo: ");
            num3 = sc.nextDouble();
            if (num3 < 0){
                System.out.println("\nEl valor ingresado es incorrecto ingrese nuevamente por favor");
            }
        }while (num3 < 0);
        resultado = num1 * num2 * num3;
        setVolumen(resultado);
            System.out.println("\nEl volumen del rectangulo es: " + getVolumen());
        }
        public void volumentriangulo(){
            do{
                System.out.print("\nIngrese el valor del lado de la base de la piramide: ");
                num1 = sc.nextDouble();
                if (num1 < 0){
                    System.out.println("\nEl valor ingresado es incorrecto ingrese nuevamente por favor");
                }
            }while (num1 < 0);
            do{
                System.out.print("Ingrese la altura de la piramide: ");
                num2 = sc.nextDouble();
                if (num2<0){
                    System.out.println("\nEl valor ingresado es incorrecto ingrese nuevamente por favor");
                }
            }while (num2<0);
            num3 = num1 * num1;
            resultado = (num3 * num2)/3;
            setVolumen(resultado);
            System.out.println("\nEl volumen de la piramide es: " + getVolumen());
        }
        public void volumencilindro(){
            do{
                System.out.print("\nIngrese el valor del radio: ");
                num1 = sc.nextDouble();
                if (num1 <0){
                    System.out.println("\nEl valor ingresado es incorrecto ingrese nuevamente porfavor");
                }
            }while (num1 < 0);
            do{
                System.out.print("Ingrese la altura del cilindro: ");
                num2 = sc.nextDouble();
                if (num2 < 0){
                    System.out.println("\nEl valor ingresado es incorrecto ingrese nueavamente porfavor");
                }
            }while (num2 < 0);
            resultado = (pi * (num1*num1))*num2;
            setVolumen(resultado);
            System.out.println("\nEl volumen del cilindro es: " + getVolumen());
        }
    }

