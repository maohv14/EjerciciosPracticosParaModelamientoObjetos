package exercise3;

import java.util.Scanner;

/**
 * Esta clase  se define como abstracta y solicita al usaurio ingresar la cantidad de elementos para generar un arreglo aleatorio y luego
 * ordenarlos por el método que seleccione el usaurio (Algoritmo de Burbuja o algoritmo QuickSort ).
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0
 */
public abstract class ArraySort {
    /**
     * Definición de atributos y del arreglo
     */
    private int arrayLength = 0;
    Scanner input = new Scanner(System.in);
    double tidyArray[] = new double[arrayLength];

    /**
     * Este método establece la extructura de control para que el usuario ingrese la cantidad de elementos del arreglo
     * y la opción para ordenarlo.
     *
     * @param array
     */
    public abstract void Order(double array[]);

    public void UserInterface() {
        System.out.println("Por favor  ingrese la cantidad de elementos del arreglo");
        setArrayLength(input.nextInt());
        double array[] = new double[arrayLength];
        System.out.println("Arreglo generado de forma aleatoria: ");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = (Math.random() * 10);
            System.out.print(" ");
            System.out.print(array[i]);
        }

        int flag = 0;
        int option = 0;
        do {
            do {
                System.out.println("");
                System.out.println("Por favor seleccione función para ordenar el arreglo");
                System.out.println("");
                System.out.println("    1. Algoritmo burbuja.");
                System.out.println("    2. Quick sort.");
                System.out.println("    3. Salir.");
                System.out.println("");
                option = input.nextInt();

                if (option >= 1 && option <= 3) {
                    flag = 1;
                } else {
                    System.out.println("---------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar");
                    System.out.println("---------------------------------------");
                }

            } while (flag == 0);
            switch (option) {
                case 1:
                    ArraySort courier1 = new BubbleAlgorithm();
                    courier1.Order(array);
                    break;
                case 2:
                    ArraySort courier2 = new QuickSort();
                    courier2.Order(array);
                case 3:
                    System.out.println("------------------");
                    System.out.println("  ¡Hasta pronto!");
                    System.out.println("------------------");
                    flag = 3;
                    break;
                default:
                    break;
            }

        } while (flag != 3);
    }

    /**
     * Métodos getter y setter de los atributos definidas en esta clase.
     *
     * @return
     */
    public int getArrayLength() {
        return arrayLength;
    }

    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public double[] getTidyArray() {
        return tidyArray;
    }

    public void setTidyArray(double[] tidyArray) {
        this.tidyArray = tidyArray;
    }
}
