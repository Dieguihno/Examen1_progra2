/*
primer examen parcial programacion 2
Estudiantes: Diego Monge Villegas y  Alonso Alvarado Mora
profesor: Andres Ulloa Brenes
 */
package primerparcial_mongevillegas_alvaradomora;

import Entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class CarritoCompras {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("San Jose, catedral", "88996788", "bronce", "Julian", "Quiros Astorga");
        Empleado empleado1 = new Empleado("0143", "vendedor", "Christian", "Salazar campos");
        Articulo articulo1 = new Articulo(25000, "Tarjeta madre", "Acer", 2);
        Articulo articulo2 = new Articulo(30000, "monitor", "LG", 1);

        ArrayList<Articulo> facturas = new ArrayList<>();
        facturas.add(articulo1);
        facturas.add(articulo2);

        Collections.sort(facturas, (Articulo p1, Articulo p2) -> {
            return new Double((p1.getValorUnitario())).compareTo((p2.getValorUnitario()));
        }
        );

        double montoTotal = 0;

        for (Articulo factura : facturas) {
            montoTotal = montoTotal + (factura.getTotalArticulo());

        }
        
        Date fecha = new Date();
        Factura factura1 = new Factura(fecha, empleado1, cliente1, facturas);
        System.out.println(factura1.toString());
        
               

       System.out.println("\nMonto total de la compra: \n"+montoTotal+ " colones" + "\nimpuestos y envio incluidos");
        
        

       
    }

}
