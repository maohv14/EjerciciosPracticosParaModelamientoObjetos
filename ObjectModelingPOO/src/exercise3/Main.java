package exercise3;

/**
 * Clase principal que contiene al métod Main que permite la ejecuión del programa para ordenar un arreglo ya sea por
 * el algoritmo de burbuja o el de QuickSort.
 *
 * @author Mauro Villada Villada, mauro10@gmail.com
 * @version 1.0.0 2022-02-17
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("**************************************************");
        System.out.println("   Bienvenid@ al ordenador de arreglos-");
        System.out.println("**************************************************");
        System.out.println("");
        ArraySort courier = new BubbleAlgorithm();
        courier.UserInterface();
    }
}
