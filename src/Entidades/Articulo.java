/*
primer examen parcial programacion 2
Estudiantes: Diego Monge Villegas y  Alonso Alvarado Mora
profesor: Andres Ulloa Brenes
 */
package Entidades;

public class Articulo {

    private double valorUnitario;
    private String categoria; 
    private String marca;
    private int cantidadComprar;
    private double envio; 
    private double impuestoValorAgregado; 
    private double subtotal; 
    private double totalArticulo; 

    public Articulo(double valorUnitario, String categoria, String marca, int cantidadComprar) {
        this.valorUnitario = valorUnitario;
        this.categoria = categoria;
        this.marca = marca;
        this.cantidadComprar = cantidadComprar;
        this.subtotal = valorUnitario * cantidadComprar;
        this.impuestoValorAgregado = ((20 * this.subtotal) / 100);
        this.envio = ((30 * this.subtotal) / 100);
        this.totalArticulo = this.subtotal + this.impuestoValorAgregado + this.envio;
    }

    public void setTotalArticulo(double totalArticulo) {
        this.totalArticulo = subtotal + envio + impuestoValorAgregado;
    }

    public double getTotalArticulo() {
        return totalArticulo;
    }

    /**
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
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

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the cantidadComprar
     */
    public int getCantidadComprar() {
        return cantidadComprar;
    }

    /**
     * @param cantidadComprar the cantidadComprar to set
     */
    public void setCantidadComprar(int cantidadComprar) {
        this.cantidadComprar = cantidadComprar;
    }

    /**
     * @return the envio
     */
    public double getEnvio() {
        return envio;
    }

    /**
     * @param envio the envio to set
     */
    public void setEnvio(double envio) {
        this.envio = ((30 * this.subtotal) / 100);
    }

    /**
     * @return the impuestoValorAgregado
     */
    public double getImpuestoValorAgregado() {
        return impuestoValorAgregado;
    }

    /**
     * @param impuestoValorAgregado the impuestoValorAgregado to set
     */
    public void setImpuestoValorAgregado(double impuestoValorAgregado) {
        this.impuestoValorAgregado = ((20 * this.subtotal) / 100);
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = getCantidadComprar() * getValorUnitario();
    }

    @Override
    public String toString() {
        return "\n****Articulo en el carrito de compras ***** \n" + "\n Categoria: " + categoria + ", Marca: " + marca
                + "\n Valor Unitario: " + this.getValorUnitario() + ", Cantidad a Comprar " + getCantidadComprar() + "\n subtotal: " + this.getSubtotal() + " colones"
                + "\n IVA: " + getImpuestoValorAgregado() + " colones " + "\n subtotal con IVA: " + (getImpuestoValorAgregado() + getSubtotal()) + " colones "
                + "\n costo envio: " + getEnvio() + " colones "
                + "\n subtotal por la compra del (los) articulo (s): " + getTotalArticulo() + " colones ";
       

    }
    
   
}