/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semanaa5;

/**
 *
 * @author Hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colecciones colecciones = new Colecciones();
        
        colecciones.mostrarNombres();
        // Crear instancia de la clase de sobrecarga de métodos
        Sobrecarga sobrecarga = new Sobrecarga();

        // Llamar a los métodos sobrecargados
        System.out.println("Suma de enteros: " + sobrecarga.sumar(5, 10));
        System.out.println("Suma de decimales: " + sobrecarga.sumar(5.5, 10.5));
    }
    }
    

