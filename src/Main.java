/*EJERCICIO TIENDA ZAPATERIA

Vamos a probar a usar la herencia para evitar repetir código y unir tres clases de zapatos:

Crear una clase madre Zapato de las clases: casual, elegante y deporte.
Y ver cómo se usa en el main (arraylist de Zapatos que puede incluir todos los tipos).

Cómo creas un arraylist con todas las clases hijas para poder recorrer sus propiedades?
Cómo sumarías todos los precios de todos los zapatos?

+EXTRA: que alguna clase (o más de una) tenga algún atributo extra (o más de uno).
Ejemplo: la categoría Elegante -> boolean tieneHebilla;
En ese caso, no olvidar modificar el toString() y añadir los métodos pertinentes (getters y setters)
en la clase hija (getters-setters de los atributos específicos, e incluirlos en el toString)*/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Zapato z1 = new Casual("Vans Old School", 75.0f, 42, "cuero", "velcro");
        Zapato z2 = new Deporte("Nike Air Zoom", 120.50f, 44, "running", "lisa");
        Zapato z3 = new Elegante("Oxford Classic", 150.0f, 41, true);

        Zapato z4 = new Casual("Converse Chuck Taylor", 65.0f, 39, "goma", "velcro");
        Zapato z5 = new Deporte("Adidas Ultraboost", 180.0f, 43, "senderismo", "tacos");
        Zapato z6 = new Elegante("Loafer Italiano", 135.0f, 40, false);

        ArrayList<Zapato> tiendaZapatos = new ArrayList<>(Arrays.asList(z1, z2, z3, z4, z5, z6));

        // MOSTRAR LISTA DE ZAPATOS
        System.out.println("***LISTA DE ZAPATOS***");
        for  (Zapato zap : tiendaZapatos) {
            System.out.println("-> " + zap);
        }

        // PRECIO TOTAL
        double precioTotal = 0;

        for (Zapato zap : tiendaZapatos) {
            precioTotal += zap.getPrecio();
        }

        System.out.printf("\nPrecio total de los zapatos: %.2f €\n", precioTotal);

        /*System.out.println("\n" + tiendaZapatos);*/

    }
}
