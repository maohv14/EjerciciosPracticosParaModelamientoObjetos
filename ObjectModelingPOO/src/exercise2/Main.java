package exercise2;

/**
 * Clase que contiene al metodo main y determina el punto de entrada al program, este es un ejercicio practico
 * pra demostrar que si es posible implementar el metodo main en cualquier clase y correr el progrma sin problemas.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Aqui se corre la secuencia principal del programa");
        MainDos main2 = new MainDos();
        main2.main();
        System.out.println("En conclusión: ");
        System.out.println("Si Es posible ejecutar un programa en java que contenga varias clases con métodos main" + "\n"
                + "aunque sea confuso, por definición el metodo con la firma public static void main(String[] args){}" + "\n"
                + "determina el punto de entrada al programa, los demás main seran tomados como sobrecarga");
    }
}
