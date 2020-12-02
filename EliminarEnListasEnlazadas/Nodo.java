package EliminarEnListasEnlazadas;
public class Nodo {
    
    Object elemento;
    Nodo sig;
    
    public Nodo(Object nombre){
        this.elemento = nombre;
        this.sig = null;
    }
}
