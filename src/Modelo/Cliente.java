/*
 */
package Modelo;

public class Cliente {

    private String Nombre;
    private String Apellido;
    private String DNI;
    private String sexo;
    private String colegio;
    int edad;

    public Cliente(Object[] Registro) {
        this.Nombre = Registro[0].toString();
        this.Apellido = Registro[1].toString();
        this.edad = Integer.parseInt(Registro[2].toString());
        this.DNI = Registro[3].toString();
        this.sexo = Registro[4].toString();
        this.colegio = Registro[5].toString();
    }

    public Object[] getRegistro() {
        Object[] Registro = {Nombre, Apellido, edad, DNI, sexo, colegio};
        return Registro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

}
