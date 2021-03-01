/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Date;

public class Factura {

    private Date fecha;
    private Empleado empleado;
    private Cliente cliente;
    private ArrayList<Articulo> lineaFactura;
    private double montoTotal;

    public Factura(Date fecha, Empleado empleado, Cliente cliente, ArrayList<Articulo> articulo) {
        this.fecha = fecha;
        this.empleado = empleado;
        this.cliente = cliente;
        this.lineaFactura = articulo;

    }

    public Factura() {

    }

    public ArrayList<Articulo> getLineaFactura() {
        return lineaFactura;
    }

    public void setLineaFactura(ArrayList<Articulo> lineaFactura) {
        this.lineaFactura = lineaFactura;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "****Carrito de compras**** " + "\n" + fecha + "\n" + empleado + "\n" + cliente + "\n" + lineaFactura;
    }

}
