import java.util.Scanner;

public class Calculadora {

    Scanner calcula = new Scanner(System.in);
    int opcion;
    
    public Calculadora (int opcion){
        this.opcion = opcion;
    }

    public void menu (){

        do {
            System.out.println("===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Exponencial");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = calcula.nextInt();
            switch(opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    exponencial();
                    break;
                case 6:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while(opcion != 6);
        calcula.close();
    }
    

    public static void sumar() {
        Scanner calcula = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = calcula.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = calcula.nextDouble();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    
    public static void restar() {
        Scanner calcula = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double num1 = calcula.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = calcula.nextDouble();
        
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    
    public static void multiplicar() {
        
        Scanner calcula = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = calcula.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = calcula.nextDouble();
        
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
    }
    
    public static void dividir() {
        
        Scanner calcula = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        double dividendo = calcula.nextDouble();
        
        System.out.print("Ingrese el divisor: ");
        double divisor = calcula.nextDouble();
        
        if(divisor == 0) {
            System.out.println("No se puede dividir entre cero.");
        } else {
            System.out.println(dividendo + " / " + divisor + " = " + (dividendo / divisor));
        }
    }
    
    public static void exponencial() {
        
        Scanner calcula = new Scanner(System.in);
        
        System.out.print("Ingrese la base: ");
        double base = calcula.nextDouble();
        
        System.out.print("Ingrese el exponente: ");
        double exponente = calcula.nextDouble();
        
        System.out.println(base + " ^ " + exponente + " = " + Math.pow(base, exponente));
    }

}
