package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Arbol_Cliente {

    private Nodo Raiz;

    public Arbol_Cliente() {
        Raiz = null;
    }

    public Nodo getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo Raiz) {
        this.Raiz = Raiz;
    }

    public Nodo Agregar(Nodo Nodo, Cliente Elemento) {   //Metodo para agregar un Nodo a un Arbol
        if (Nodo == null) { //verifica si existen elemento en el Arbol
            Nodo Nuevo = new Nodo(Elemento);     //crear un nodo
            return Nuevo;
        } else {
            if (Elemento.getNombre().compareTo(Nodo.getElemento().getNombre()) > 0){//Compara los nombres quien es mayor
                Nodo.setDerecha(Agregar(Nodo.getDerecha(), Elemento));      //llamada recursiva para agregar a la derecha
            } else {
                Nodo.setIzquierda(Agregar(Nodo.getIzquierda(), Elemento));      //llamada recursiva para agregar a la izquierda
            }
        }
        return Nodo;
    }

    public Nodo BuscarNombre(String Dato) {  //Metodo para Buscar por ApeNom en un Arbol
        Nodo Auxiliar = Raiz;   //Inicia el recorrido por la raiz del Arbol

        while (Auxiliar != null) {
            if (Auxiliar.getElemento().getNombre().toUpperCase().startsWith(Dato.toUpperCase())) {    //Comparar los ApeNom con el Dato enviado como parametro
                return Auxiliar;     //Si lo encuentra retorna el Auxiliar y acaba el metodo
            } else {
                if (Dato.compareTo(Auxiliar.getElemento().getNombre()) > 0) //Compara el Dato enviado como parametro con el ApeNom del Nodo
                {
                    Auxiliar = Auxiliar.getDerecha();   //Avanza el recorrido por la derecha
                } else {
                    Auxiliar = Auxiliar.getIzquierda();   //Avanza el recorrido por la izquierda            
                }
            }
        }
        return null;
    }

    public void Listar_InOrder(Nodo Nodo, DefaultTableModel modTabla) {  //Metodo para recorrer un arbol binario
        if (Nodo != null) {   //verifica que existan elementos en el Arbol
            Listar_InOrder(Nodo.getIzquierda(), modTabla);   //llamada recursiva avanzando por la izquierda
            modTabla.addRow(Nodo.getElemento().getRegistro());  //Colocar los datos en un DefaultTableModel
            Listar_InOrder(Nodo.getDerecha(), modTabla);  //llmada recursiva avanzando por la derecha
        }

    }

    public Nodo BuscarMayorIzquierda(Nodo Auxiliar) {
        if (Auxiliar != null) {
            while (Auxiliar.getDerecha() != null) {
                Auxiliar = Auxiliar.getDerecha();
            }
        }
        return Auxiliar;
    }

    public Nodo EliminarMayorIzquierda(Nodo Auxiliar) {
        if (Auxiliar == null) {
            return null;
        } else if (Auxiliar.getDerecha() != null) {
            Auxiliar.setDerecha(EliminarMayorIzquierda(Auxiliar.getDerecha()));
            return Auxiliar;
        }
        return Auxiliar.getIzquierda();
    }

    public Nodo Eliminar(Nodo Auxiliar, String Dato) {    //APELLIDOS Y NOMBRES
        if (Auxiliar == null) {
            return null;       //Nodo no existe 
        }
        if (Dato.compareTo(Auxiliar.getElemento().getNombre()) < 0) //Compara el dato enviado como parametro con el Nodo Auxiliar
        {
            Auxiliar.setIzquierda(Eliminar(Auxiliar.getIzquierda(), Dato));         //Elimina el elemento de la izquierda
        } else if (Dato.compareTo(Auxiliar.getElemento().getNombre()) > 0) {
            Auxiliar.setDerecha(Eliminar(Auxiliar.getDerecha(), Dato));         //Elimina el elemento de la derecha
        } else if (Auxiliar.getIzquierda() != null && Auxiliar.getDerecha() != null) //Elimina EL PADRE CON DOS HIJOS
        {
            Auxiliar.setElemento(BuscarMayorIzquierda(Auxiliar.getIzquierda()).getElemento());
            Auxiliar.setIzquierda(EliminarMayorIzquierda(Auxiliar.getIzquierda()));
        } //Eliminar al hijo;
        else {
            Auxiliar = (Auxiliar.getIzquierda() != null)
                    ? Auxiliar.getIzquierda() : Auxiliar.getDerecha();
        }

        return Auxiliar;
    }

    public void Listar(Nodo Nodo, ArrayList<Cliente> listacliente) {  //Metodo para recorrer un arbol binario
        if (Nodo != null) {   //verifica que existan elementos en el Arbol
            Listar(Nodo.getIzquierda(), listacliente);   //llamada recursiva avanzando por la izquierda
            listacliente.add(new Cliente(Nodo.getElemento().getRegistro()));   //Colocar los datos en un DefaultTableModel
            Listar(Nodo.getDerecha(), listacliente);  //llmada recursiva avanzando por la derecha
        }
    }
}
