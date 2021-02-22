/*
primer examen parcial programacion 2
Estudiantes: Diego Monge Villegas y  Alonso Alvarado Mora
profesor: Andres Ulloa Brenes
 */
package primerparcial_mongevillegas_alvaradomora;

import Entidades.*;

public class CarritoCompras {

    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("San Jose, catedral", "88996788", "bronce", "Julian", "Quiros Astorga");
        Empleado empleado1 = new Empleado("0143", "vendedor", "Christian", "Salazar campos");        
        Articulos articulo1 = new Articulos(25000, "tarjeta madre", "Aorus", 2);
        Factura factura1 = new Factura(60000, articulo1);
        
        
        
        System.out.println(cliente1.toString());
        System.out.println(empleado1.toString());
        System.out.println(factura1.toString());
        
        /*
        falta: hacer el array para crear varios articulos
        que de la suma total de todos los articulos con impuestos y todo
        que ordene los articulos por valor unitario
        */
      
        
    }
    
}
