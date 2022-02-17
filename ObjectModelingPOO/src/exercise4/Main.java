package exercise4;

/**
 * Clase principal que contiene al métod Main que permite la ejecuión del programa para enlistar vehículos en un Ferry
 * con diferentes atributos.
 *
 * @author Mauro Villada Villada, mauro10@gmail.com
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
