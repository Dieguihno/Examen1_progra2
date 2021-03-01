/*
primer examen parcial programacion 2
Estudiantes: Diego Monge Villegas y  Alonso Alvarado Mora
profesor: Andres Ulloa Brenes
 */
package Entidades;


public class Cliente extends Persona{
    
    private String direccion;
    private String telefono;
    private String categoria; 

    public Cliente (String direccion, String telefono, String categoria, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.direccion = direccion;
        this.telefono = telefono;
        this.categoria = categoria;
    }

    
    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Informacion Cliente: " + this.getNombre() + " " + this.getApellidos() + " \n direccion: " + direccion + "\n telefono: " + telefono + ", categoria=" + categoria +
                "\n____________________________________";
    }
    
}
