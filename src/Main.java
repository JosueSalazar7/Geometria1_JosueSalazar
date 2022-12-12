import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, opcion1, opcion2, opcion3, repeticion;
        double num1 = 0, resultado = 0, num2 = 0, num3 = 0;
        Metodos m = new Metodos();
        System.out.println("****MENU PRINCIPAL****");
        System.out.println("\n1. Areas");
        System.out.println("2. Perimetros");
        System.out.println("3. Volumenes");
        do {
            System.out.print("\nEscoga el calculo que desea realizar: ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 3);
        switch (opcion) {
            case 1:
                do {
                    System.out.println("\nOpcion escogida: Areas");
                    System.out.println("\n****SUBMENU AREAS****");
                    System.out.println("\n1. Area del cuadrado");
                    System.out.println("2. Area del rectangulo");
                    System.out.println("3. Area del trianuglo");
                    System.out.println("4. Area del circulo");
                    do {
                        System.out.print("\nEscoja el area a calcular: ");
                        opcion1 = sc.nextInt();
                    } while (opcion1 < 1 || opcion1 > 4);
                    switch (opcion1) {
                        case 1:
                            System.out.println("\nOpcion escogida: Area del cuadrado");
                            m.areacuadrado(num1, resultado);
                            break;
                        case 2:
                            System.out.println("\nOpcion escogida: Area del Rectangulo");
                            m.arearectangulo(num1, num2, resultado);
                            break;
                        case 3:
                            System.out.println("\nOpcion escogida: Area del triangulo");
                            m.areatriangulo(num1, num2, resultado);
                            break;
                        case 4:
                            System.out.println("\nOpcion escogida: Area del circulo");
                            m.areacirculo(num1, resultado);
                            break;
                    }
                    System.out.print("Desea calcular otra area 1. SI : ");
                    repeticion = sc.nextInt();
                    System.out.println();
                } while (repeticion == 1);

                break;
            case 2:
                do {
                    System.out.println("\nOpcion escogida: Perimetro");

                    System.out.println("\n****SUBMENU PERIMETRO****");
                    System.out.println("\n1. Perimetro del cuadrado");
                    System.out.println("2. Perimetro del rectangulo");
                    System.out.println("3. Perimetro del trianuglo");
                    System.out.println("4. Perimetro del circulo");
                    do {
                        System.out.print("\nEscoja el perimetro a calcular: ");
                        opcion2 = sc.nextInt();
                    } while (opcion2 < 1 || opcion2 > 4);
                    switch (opcion2) {
                        case 1:
                            System.out.println("\nOpcion escogida: Perimetro del cuadrado");
                            m.perimetrocuadrado(num1, resultado);
                            break;
                        case 2:
                            System.out.println("\nOpcion escogida: Perimetro del rectangulo");
                            m.perimetrorectangulo(num1, num2, resultado);
                            break;
                        case 3:
                            System.out.println("\nOpcion escogida: Perimetro del triangulo");
                            m.perimetrotriangulo(num1, num2, num3, resultado);
                            break;
                        case 4:
                            System.out.println("\nOpcion escogida: Perimetro del circulo");
                            m.perimetrocirculo(num1, resultado);
                            break;
                    }
                    System.out.print("\nDesea calcular otro perimetro 1.Si: ");
                    repeticion = sc.nextInt();
                }while(repeticion == 1);

                break;
            case 3:
                System.out.println("\nOpcion escogida: Volumenes");

                System.out.println("\n****SUBMENU VOLUMENES****");
                System.out.println("\n1. Volumen del cuadrado");
                System.out.println("2. Volumen del rectangulo");
                System.out.println("3. Volumen del trianuglo");
                System.out.println("4. Volumen del circulo");
                do {
                    System.out.print("\nEscoja el volumen a calcular: ");
                    opcion3 = sc.nextInt();
                } while (opcion3 < 1 || opcion3 > 4);
                switch (opcion3) {
                    case 1:
                        System.out.println("Opcion escogida: Volumen del cuadrado");

                        break;
                    case 2:
                        System.out.println("Opcion escogida: Volumen del rectangulo");

                        break;
                    case 3:
                        System.out.println("Opcion escogida: Volumen del triangulo");

                        break;
                    case 4:
                        System.out.println("Opcion escogida: Volumen del circulo");

                        break;
                }
                break;
        }
    }
}