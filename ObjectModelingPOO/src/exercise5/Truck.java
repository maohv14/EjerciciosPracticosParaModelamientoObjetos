package exercise5;

import javax.swing.JOptionPane;

/**
 * Clase Truck la cual hereda de la clase Vehicle y define atributo especifico de la longitud del camión, que cual,
 * permitirá diferenciar entre camiones.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0 2022-02-17
 */
public class Truck extends Vehicle {
    private float longTruck;

    public Truck(int identifier, int numberPassengers, int numberWheels, String isCrewed, String registrationDate, String transportType) {
        super(identifier, numberPassengers, numberWheels, isCrewed, registrationDate, transportType);
    }

    /**
     * Método heredado de la clase Vehicle y atraves de secuencias de comparación en la longitud define el tipo de camión,
     * Sencillo, Dobletroque y Tractocamión
     */
    public void VehicleType() {
        String truckType = "";
        try {
            longTruck = Float.parseFloat(JOptionPane.showInputDialog("¿El vehiculo  en la posición " + identifier +
                    " es un camión ¿Cuál es la longitud en metros?"));
        } catch (Exception e) {
            System.out.println("ERROR: el valor de tipo String contiene caracteres no numéricos");
        }

        if (longTruck <= 6.0) {
            truckType = "Camión sencillo";

        }
        if (longTruck > 6.0 && longTruck <= 10.0) {
            truckType = "Camión dobletroque";

        }
        if (longTruck > 10.0) {
            truckType = "Tractocamión";
        }
        System.out.println(identifier + "  Tipo: " + truckType + " Fecha de registro: " + registrationDate + "  Pasajeros: " + numberPassengers +
                "  Cantidad de ruedas: " + numberWheels + "  Con tripulación: " + isCrewed + "  Medio de desplazamiento: " + transportType);
    }
}
