package exercise5;

import javax.swing.JOptionPane;

/**
 * Clase Car la cual hereda de la clase Vehicle y define atributo especifico que cual permitirá diferenciar el tipo de carro.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0 2022-02-17
 */
public class Car extends Vehicle {
    private int numDoors;

    public Car(int identifier, int numberPassengers, int numberWheels, String isCrewed, String registrationDate, String transportType) {
        super(identifier, numberPassengers, numberWheels, isCrewed, registrationDate, transportType);
    }

    /**
     * Método heredado de la clase Vehicle que a travez de secuencias comparativas del número de puertas permite definir
     * entre dos tipos de carro, Coupé o Sedan
     */
    public void VehicleType() {

        String carType = "";
        try {
            numDoors = Integer.parseInt(JOptionPane.showInputDialog("¿El vehiculo  en la posición " + identifier +
                    " es un auto ¿Cuántas puertas tiene, 3 o 5?"));
        } catch (Exception e) {
            System.out.println("ERROR: el valor de tipo String contiene caracteres no numéricos");
        }

        if (numDoors == 3) {
            carType = "Coupé  ";
        } else if (numDoors == 5) {
            carType = "Sedán  ";
        }
        System.out.println(identifier + "  Tipo: " + carType + " Fecha de registro: " + registrationDate + "  Pasajeros: " + numberPassengers +
                "  Cantidad de ruedas: " + numberWheels + "  Con tripulación: " + isCrewed + "  Medio de desplazamiento: " + transportType);


    }
}
