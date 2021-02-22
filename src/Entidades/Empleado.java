/**
primer examen parcial programacion 2
Estudiantes: Diego Monge Villegas y  Alonso Alvarado Mora
profesor: Andres Ulloa Brenes
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Empleado extends Persona {
    
    private String numeroEmpleado;
    private String puesto;  //vendedor administrador o gerente

    public Empleado(String numeroEmpleado, String puesto, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.numeroEmpleado = numeroEmpleado;
        this.puesto = puesto;
    }
    
    

    /**
     * @return the numeroEmpleado
     */
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * @param numeroEmpleado the numeroEmpleado to set
     */
    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado: " + this.getNombre() + " "+ this.getApellidos() + "\n numeroEmpleado: " + numeroEmpleado + ", puesto=" + puesto;
    }
    
    
    
    
    
    
}
