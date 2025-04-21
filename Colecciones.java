/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanaa5;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Colecciones {
    public void mostrarNombres() {
       
        // Crear un ArrayList para almacenar nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Eduar");
        nombres.add("Juana");
        nombres.add("Marío");

        // Recorrer el ArrayList e imprimir los nombres
        for (String nombre : nombres) {
            System.out.println("Hola, " + nombre); // Esto debería imprimir cada nombre.
        }
    }

    }

