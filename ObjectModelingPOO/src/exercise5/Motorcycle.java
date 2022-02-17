package exercise5;

import javax.swing.JOptionPane;

/**
 * Clase Motorcycle la cual hereda de la clase Vehicle y define atributo especifico de cilindraje, para definir entre,
 * motos de bajo, mediano y alto cilindraje.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0 2022-02-17
 */
public class Motorcycle extends Vehicle {
    private int cyliderCapacity;

    public Motorcycle(int identifier, int numberPassengers, int numberWheels, String isCrewed, String registrationDate, String transportType) {
        super(identifier, numberPassengers, numberWheels, isCrewed, registrationDate, transportType);
    }

    /**
     * Método heredado de la clase Vehicle y atraves de secuencias de comparación del cilindraje se puede deifinir el
     * tipo de moto.
     */
    public void VehicleType() {
        String motorcycleType = "Null";
        try {
            cyliderCapacity = Integer.parseInt(JOptionPane.showInputDialog("¿El vehiculo  en la posición " + identifier +
                    " es una moto ¿Cuál escilindraje?"));
        } catch (Exception e) {
            System.out.println("ERROR: el valor de tipo String contiene caracteres no numéricos");
        }

        if (cyliderCapacity >= 1 && cyliderCapacity <= 200) {
            motorcycleType = "Tipo: Moto de bajo cilindraje  ";
        } else if (cyliderCapacity > 200 && cyliderCapacity <= 400) {
            motorcycleType = "Tipo: Moto de mediano cilindraje  ";
        } else if (cyliderCapacity > 400) {
            motorcycleType = "Tipo: Moto de alto cilindraje  ";
        }
        System.out.println(identifier + "  " + motorcycleType + " Fecha de registro: " + registrationDate + "  Pasajeros: " + numberPassengers +
                "  Cantidad de ruedas: " + numberWheels + "  Con tripulación: " + isCrewed + "  Medio de desplazamiento: " + transportType);
    }
}
