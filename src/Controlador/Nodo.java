package Controlador;
import Modelo.Cliente;

public class Nodo {
   
    Cliente Elemento;
    Nodo Izquierda, Derecha;
    
 public Nodo (Cliente Registro){
     this.Elemento = Registro;
     Izquierda = Derecha = null; 
 }   

    public Cliente getElemento() {
        return Elemento;
    }

    public void setElemento(Cliente Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo Izq) {
        this.Izquierda = Izq;
    }

    public Nodo getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo Der) {
        this.Derecha = Der;
    }
 
  
 
    
}
