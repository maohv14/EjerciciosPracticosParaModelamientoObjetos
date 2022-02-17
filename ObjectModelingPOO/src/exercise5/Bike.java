package exercise5;

import javax.swing.JOptionPane;

/**
 * Clase Bike la cual hereda de la clase Vehicle y define atributo especifico de si usa o no motor electrico, para difenir
 * el tipo de bicicleta.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0 2022-02-17
 */
public class Bike extends Vehicle {
    private String isElectric;

    public Bike(int identifier, int numberPassengers, int numberWheels, String isCrewed, String registrationDate, String transportType) {
        super(identifier, numberPassengers, numberWheels, isCrewed, registrationDate, transportType);
    }

    /**
     * Método heredado de la clase Vehicle y atraves de secuencias de comparación de si usam motor electrico o no para
     * deifinir si es bicicleta electrica o mecanica.
     */
    public void VehicleType() {
        String bikeType = "";
        isElectric = JOptionPane.showInputDialog("¿El vehiculo  en la posición " + identifier + " es una bicicleta ¿Es electrica?");
        if (isElectric.equalsIgnoreCase("Si")) {
            bikeType = "Tipo: Bicicleta electrica  ";
        } else if (isElectric.equalsIgnoreCase("No")) {
            bikeType = "Tipo: Bicicleta mecanica  ";
        }
        System.out.println(identifier + "  " + bikeType + " Fecha de registro: " + registrationDate + "  Pasajeros: " + numberPassengers +
                "  Cantidad de ruedas: " + numberWheels + "  Con tripulación: " + isCrewed + "  Medio de desplazamiento: " + transportType);
    }
}
