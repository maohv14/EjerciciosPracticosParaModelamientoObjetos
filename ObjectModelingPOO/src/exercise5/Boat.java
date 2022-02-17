package exercise5;

import javax.swing.JOptionPane;

/**
 * Clase Boat la cual hereda de la clase Vehicle y define atributo especifico de si usa motor o no, lo cual,
 * permitirá diferenciar entre lanchas.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0 2022-02-17
 */
public class Boat extends Vehicle {
    private String hasMotor;

    public Boat(int identifier, int numberPassengers, int numberWheels, String isCrewed, String registrationDate, String transportType) {
        super(identifier, numberPassengers, numberWheels, isCrewed, registrationDate, transportType);
    }

    /**
     * Método heredado de la clase Vehicle y atraves de secuencias de comparación de si usa o no motor para definir el
     * tipo de lancha como Motorizada o Bote con remos.
     */
    public void VehicleType() {
        String boatType = "";
        hasMotor = JOptionPane.showInputDialog("¿El vehiculo  en la posición " + identifier + " es un bote ¿usa motor?");
        if (hasMotor.equalsIgnoreCase("Si")) {
            boatType = "Lancha motorizada  ";
        } else if (hasMotor.equalsIgnoreCase("No")) {
            boatType = "Bote con remos  ";
        }
        System.out.println(identifier + "  Tipo: " + boatType + " Fecha de registro: " + registrationDate + "  Pasajeros: " + numberPassengers +
                "  Cantidad de ruedas: " + numberWheels + "  Con tripulación: " + isCrewed + "  Medio de desplazamiento: " + transportType);
    }
}
