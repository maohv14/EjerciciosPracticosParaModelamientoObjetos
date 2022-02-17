package exercise6;

import javax.swing.JOptionPane;
import java.util.Vector;

/**
 * Esta clase  es un ejercicio practico de una clase predefinida en Java como lo es la clase "Vector", el cual consta
 * en un programa que solicita números al usuario de forma consecutiva se van almacenando en un vector y cuando el
 * usuario ingresa el mismo número consecutivamente, se imprime los números ingresados y finaliza el programa.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0 2022-02-14-17
 */

public class VectorClass {

    Vector<Integer> vector = new Vector<Integer>();
    int number;

    /**
     * Método principal el cual solicita, almacena y muestra los datos al finalizar.
     */
    public void EnterNumbers() {
        int flag = 0;

        while (flag == 0) {
            try {
                number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
                vector.addElement(number);
            } catch (Exception e) {
                System.out.println("ERROR: El valor de tipo String contiene caracteres no numéricos");
            }
            if (vector.size() > 1) {
                if (vector.elementAt(vector.size() - 1) == vector.elementAt(vector.size() - 2)) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println("Numeros ingresados hasta repitir el mismo numero consecutivamente");
                for (int i = 0; i < vector.size(); i++) {
                    System.out.println(vector.elementAt(i) + "\t");
                }
            }
        }
    }
}
