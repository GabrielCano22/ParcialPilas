import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion =0;
        String cadena = "";
        while (opcion !=3) {
            String menu = "MENU DE PROYECTOS: \n"
            + "1. Ejecutar Punto #2 Gabriel Jaime Cano Oquendo \n"
            + "2. Ejecutar Punto #9 Salomé Gil Chanci \n"
            + "3. SALIR \n";
            System.out.println(menu);
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese una cadena de texto para invertir: ");
                    cadena = sc.next();
                    InvertirG_Punto2.invertir(cadena);
                    break;
                case 2:
                    //Logica punto Salomé
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
        }
    }
}