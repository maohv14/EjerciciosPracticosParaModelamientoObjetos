package exercise3;

/**
 * Esta clase permite ordenar un arreglo utilizando el algoritmo QuickShort en Java, y hereda de la calse abstracta
 * ArraySort.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0 2022-02-17
 */
public class QuickSort extends ArraySort {
    /**
     * Implementación del método abstracto Order el cual se comporta para esta clase ejecutnado algoritmo QuickShort para
     * ordenar el arreglo
     *
     * @param array
     */
    @Override
    public void Order(double array[]) {

        int start1 = 0;
        int end1 = array.length - 1;
        QuickSortFunction(array, start1, end1);

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(" ");
            System.out.print(array[i]);
        }
        System.out.println("");
    }

    /**
     * Metodo que utiliza la recursividad para ordenar un arreglo
     *
     * @param array
     * @param start1
     * @param end1
     */
    public void QuickSortFunction(double array[], int start1, int end1) {
        int center = (start1 + end1) / 2;
        double pivot = array[center];
        int i = start1;
        int j = end1;

        do {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                double aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (start1 < j) {
            QuickSortFunction(array, start1, j);
        }
        if (i < end1) {
            QuickSortFunction(array, i, end1);
        }
    }
}
