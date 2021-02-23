/*
primer examen parcial programacion 2
Estudiantes: Diego Monge Villegas y  Alonso Alvarado Mora
profesor: Andres Ulloa Brenes
 */
package Entidades;

public class Factura {

    private double total; //total de la compra
    private Articulos articulo;

    public Factura(Articulos articulos) {
        
        this.articulo = articulos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = this.total + total;
    }

    public Articulos getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulos articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "Factura" + "\n " + articulo ;
    }
    
    
    
    

}
