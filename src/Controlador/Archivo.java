package Controlador;

import Modelo.Cliente;
import java.io.*;
import java.util.*;

public class Archivo {

    String ruta = "fichero.txt";
    Cliente c;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    File f;

    public ArrayList<Cliente> listado = new ArrayList();

    public void insertar(Cliente cliente) {
        try {
            fw = new FileWriter(ruta, true);
            String cad = cliente.getNombre() + "-" + 
                         cliente.getApellido() + "-" + 
                         cliente.getEdad() + "-" + 
                         cliente.getDNI() + "-" + 
                         cliente.getSexo() + "-" + 
                         cliente.getColegio() + "\n";
            fw.write(cad);
        } catch (IOException e) {
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
            }

        }
    }

    public void leer() {
        listado.clear();
        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            String read = br.readLine();
            String[] split;
            Object[] Registro = new Object[6];
            while (read != null) {
                split = read.split("-");
                int i = 0;
                for (String part : split) {
                    Registro[i] = part;
                    i++;
                }
                c = new Cliente(Registro);
                listado.add(c);
                read = br.readLine();
            }
        } catch (IOException e) {
        } finally {
            try {
                br.close();
            } catch (Exception e) {
            }
        }

    }

    public void actualizar(ArrayList<Cliente> array) throws FileNotFoundException, IOException {
        f = new File(ruta);
        fw = new FileWriter(ruta, true);
        fw.close();
        f.delete();

        f = new File(ruta);
        if (!f.exists());
        try {
            f.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        fw = new FileWriter(f, true);

        for (Cliente p : array) {
            String cad = p.getNombre() + "-" +    
                         p.getApellido() + "-" + 
                         p.getEdad() + "-" + 
                         p.getDNI() + "-" + 
                         p.getSexo() + "-" + 
                         p.getColegio()+ "\n";
            fw.write(cad);
            //fw.write(13);
        }
        fw.close();
    }

}
