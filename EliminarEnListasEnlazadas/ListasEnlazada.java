package EliminarEnListasEnlazadas;
import java.util.Scanner;
public class ListasEnlazada{
    
    Scanner leer = new Scanner(System.in);
    Nodo raiz = null;
    Nodo cima = null;
    Nodo anterior = null;
    Nodo siguiente = null;
    int tam = 0, posicion, contador = 1;
    boolean repetir = true;
        
    public void InsertarAlFinal(Object inserta){
        Nodo nodoactual = new Nodo(inserta);
        if(raiz == null){
            raiz = nodoactual;
            cima = nodoactual;
        }
        else{
            cima.sig = nodoactual;
            cima= nodoactual;
        }
        tam++;
    }
    
    public void InsertarAlInicio(Object inserta){
        Nodo nodoactual = new Nodo(inserta);
        if(raiz == null){
            raiz = nodoactual;
            cima = nodoactual;
        }
        else{
            nodoactual.sig = raiz;
            raiz = nodoactual;
        }
        tam++;
    }
    
    public void InsertarPisicion(Object inserta){
        Nodo auxiliar = raiz;
        System.out.println("auxiliar: "+auxiliar.elemento);
        System.out.println("raiz: "+raiz.elemento);
        System.out.println("cima: "+cima.elemento);
        
        Nodo nodoactual = new Nodo(inserta);
        if(raiz == null){
            raiz = nodoactual;
            cima = nodoactual;
        }
        else{
            while(repetir){
                System.out.println("¿Qué posición insertar?");
                posicion = leer.nextInt();
                if(posicion > tam){
                    System.out.println("Solo puedes insertar hasta la posición: "+(tam+1));                    
                }
                else{
                    repetir = false;
                }
                if(posicion == 1){
                    nodoactual.sig = raiz;
                    raiz = nodoactual;
                }
                else{
                    for(int i=1; i<=posicion;i++){
                        if(i == posicion-1){
                            anterior = auxiliar;
                            siguiente = auxiliar.sig;
                        }
                        else{
                            auxiliar = auxiliar.sig;
                        }
                    }
                    cima = raiz;
                    for(int i=1; i <=tam;i++){
                        if(cima.elemento.equals(anterior.elemento)){
                            cima.sig = nodoactual;
                            cima = nodoactual;
                            nodoactual.sig = siguiente;
                        }
                        else{
                            cima = cima.sig;
                        }
                    }
                }
            }
            tam++;
        }
    }
    
    public void Eliminar(){
        if(raiz == null){
            System.out.println("No existe ningún elemento a eliminar...");
        }
        else{
            raiz = raiz.sig;
            tam--;
            System.out.println("Dato eliminado...");
        }
    }
    
    public void Mostrar(){
        Nodo auxiliar = raiz;
        if(auxiliar == null){
            System.out.println("No existe ningún elemento a mostrar");
        }
        else{
            while(auxiliar != null){
                System.out.println(" "+auxiliar.elemento);
                auxiliar = auxiliar.sig;
            }
        }
    }
}
