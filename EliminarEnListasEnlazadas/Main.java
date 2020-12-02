package EliminarEnListasEnlazadas;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int opcion;        
        ListasEnlazada yo = new ListasEnlazada();
        
        while(continuar){
            System.out.println("");
            System.out.println("*********************************************");
            System.out.println("********************Menú*********************");
            System.out.println("****1.- Insertar Posición                ****");
            System.out.println("****2.- Eliminar                         ****");
            System.out.println("****3.- Mostrar                          ****");            
            System.out.println("****4.- Salir                            ****");
            System.out.println("*********************************************");
            System.out.println("*********************************************");            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1 -> {                    
                    
                }      
                case 2 ->{                    
                    yo.Eliminar();
                }
                case 3 -> {                    
                    yo.Mostrar();
                }
                case 4 -> continuar = false;
                default -> System.out.println("Opción incorrecta.....Vuelve a intentarlo");                                                  
            }
        }
    }
}
