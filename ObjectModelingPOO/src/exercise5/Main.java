package exercise5;

import java.util.Scanner;

/**
 * Clase principal que contiene el metodo Main, da la bienvenida e instancia la clase Vehiculo.
 *
 * @author Mauro Villada Villada, mauro1040@gamil.com
 * @version 1.0.0 2022-02-17
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*****************************************************");
        System.out.println("   Bienvenid@ al registro de vehiculos para el Ferry-");
        System.out.println("*****************************************************");
        System.out.println("");
        Vehicle courier = new Vehicle(0, 0, 0, "", "", "");
        courier.DataCollection();
    }
}
