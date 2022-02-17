package exercise3;

/**
 * Esta clase permite ordenar un arreglo utilizando el algoritmo de burbuja en Java, y hereda de la calse abstracta
 * ArraySort.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0
 */

public class BubbleAlgorithm extends ArraySort {
    /**
     * Implementación del método abstracto Order el cual se comporta para esta clase ejecutnado algoritmo de burbuja para
     * ordenar el arreglo
     *
     * @param array
     */
    @Override
    public void Order(double array[]) {
        tidyArray = array;
        double assistant = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (tidyArray[j] > tidyArray[j + 1]) {
                    assistant = tidyArray[j];
                    tidyArray[j] = tidyArray[j + 1];
                    tidyArray[j + 1] = assistant;
                }
            }
        }
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(" ");
            System.out.print(tidyArray[i]);
        }


    }
}
