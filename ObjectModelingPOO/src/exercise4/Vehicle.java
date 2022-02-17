package exercise4;

import javax.swing.JOptionPane;

/**
 * Esta clase permite que un usuario cargue una lista de vehículos para un Ferry con cierto atributos.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0 2022-02-17
 */
public class Vehicle {
    /**
     * Definición de atributos para cada uno de los objetos que se instancien de esta clase
     */
    int identifier;
    int numberPassengers;
    int numberWheels;
    String isCrewed;
    String registrationDate;
    String transportType;

    /**
     * Método constructor
     *
     * @param identifier
     * @param numberPassengers
     * @param numberWheels
     * @param isCrewed
     * @param registrationDate
     * @param transportType
     */
    public Vehicle(int identifier, int numberPassengers, int numberWheels, String isCrewed, String registrationDate, String transportType) {
        this.identifier = identifier;
        this.numberPassengers = numberPassengers;
        this.numberWheels = numberWheels;
        this.isCrewed = isCrewed;
        this.registrationDate = registrationDate;
        this.transportType = transportType;
    }

    /**
     * Método que permite solicitar datos al usuario e irlos almacenando en un arreglo limitado a 10 posiciones de objetos
     * de la clase Vehiculo
     */
    public void DataCollection() {
        Vehicle vehicleList[] = new Vehicle[10];

        try {
            for (int i = 0; i < vehicleList.length; i++) {
                identifier = i + 1;
                System.out.println("Vamos a tomar los datos para el vehiculo No. " + identifier);
                isCrewed = JOptionPane.showInputDialog("Por favor indique si el vehiculo lleva tripulación o no");
                registrationDate = JOptionPane.showInputDialog("Por favor la fecha de registro del vehiculo DDMMAAAA");
                transportType = JOptionPane.showInputDialog("Por favor ingresar el medio por el cual se desplaza: Tierra o agua");
                numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el número de pasajeros del vehiculo"));
                numberWheels = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el número de ruedas del vehiculo"));

                vehicleList[i] = new Vehicle(identifier, numberPassengers, numberWheels, isCrewed, registrationDate, transportType);
            }
        } catch (Exception e) {
            System.out.println("ERROR: el valor de tipo String contiene caracteres no numéricos");

        }
        ShowVehicleList(vehicleList);
    }

    /**
     * Méto que permite mostrar por consola la lísta de Vehículos ingresados al Ferry con sus respectivos atributos
     *
     * @param vehicles
     */

    public void ShowVehicleList(Vehicle[] vehicles) {
        System.out.println("-----------------------------------------------");
        System.out.println("--Lista de vehículos regristrados en el Ferry--");
        System.out.println("-----------------------------------------------");
        System.out.println("");

        try {
            for (int i = 0; i < vehicles.length; i++) {
                System.out.println(vehicles[i].identifier + " Fecha de registro: " + vehicles[i].registrationDate +
                        "  Pasajeros: " + vehicles[i].numberPassengers + "  Cantidad de ruedas: " + vehicles[i].numberWheels +
                        "  Con tripulación: " + vehicles[i].isCrewed + "  Medio de desplazamiento: " + vehicles[i].transportType);
            }
        } catch (Exception e) {
            System.out.println("ERROR: No fue posible completar los datos no se puede mostrar lista");
        }
    }
}
