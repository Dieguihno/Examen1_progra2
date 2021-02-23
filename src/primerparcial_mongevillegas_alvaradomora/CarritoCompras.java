/*
primer examen parcial programacion 2
Estudiantes: Diego Monge Villegas y  Alonso Alvarado Mora
profesor: Andres Ulloa Brenes
 */
package primerparcial_mongevillegas_alvaradomora;

import Entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class CarritoCompras {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("San Jose, catedral", "88996788", "bronce", "Julian", "Quiros Astorga");
        Empleado empleado1 = new Empleado("0143", "vendedor", "Christian", "Salazar campos");
        Articulos articulo1 = new Articulos(25000, "tarjeta madre", "Aorus", 2);
        Articulos articulo2 = new Articulos(30000, "monitor", "LG", 1);

        ArrayList<Articulos> facturas = new ArrayList<>();
        facturas.add(articulo1);
        facturas.add(articulo2);

        Collections.sort(facturas, (Articulos p1, Articulos p2) -> new Double((p1.getValorUnitario())).compareTo((p2.getValorUnitario())) // Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
        );

        System.out.println(cliente1.toString());
        System.out.println(empleado1.toString());
        System.out.println(facturas.toString());

        /*
        falta: 
        que de la suma total de todos los articulos con impuestos y todo (en el main)
        
        
         */
    }

}
