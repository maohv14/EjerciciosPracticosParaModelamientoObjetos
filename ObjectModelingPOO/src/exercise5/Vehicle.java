package exercise5;

import javax.swing.JOptionPane;

/**
 * Esta clase define los atributos principales para la creación o modelamiento de objetos del tipo Vehículo, los atributos
 * se iran almacenando en un arreglo a medida que el usuario los vaya ingresando acorde como se solicitan.
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0 2022-02-17
 */

public class Vehicle {
    /**
     * Definición de atributos principales
     */
    protected int identifier;
    protected int numberPassengers;
    protected int numberWheels;
    protected String isCrewed;
    protected String registrationDate;
    protected String transportType;

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
     * Método principal el cual captura los datos que se solicitan al usuario y se almacenan en un arreglo que inicialmente
     * está definido para 10 posiciones, impelementa excepción ya que el usuario puede ingresar tipo de datos no esperados.
     * Ej: Se espera datos tipo entero y el usuario ingresa una cadena
     */
    public void DataCollection() {
        Vehicle vehicleList[] = new Vehicle[10];

        try {
            for (int i = 0; i < vehicleList.length; i++) {
                identifier = i + 1;
                System.out.println("Vamos a tomar los datos para el vehiculo No. " + identifier);
                isCrewed = JOptionPane.showInputDialog("Por favor indique si el vehiculo lleva tripulación o no");
                registrationDate = JOptionPane.showInputDialog("Por favor la fecha de registro del vehiculo DD/MM/AAAA");
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
     * Este método permite mostrar en lista los vehiculos registrados y los categoriza acorde a atributos especificos de
     * cada clase de vehículo. Impelementa excepción ya que el usuario puede ingresar tipo de datos no esperados.
     * * Ej: Se espera datos tipo entero y el usuario ingresa una cadena
     *
     * @param vehicles
     */

    public void ShowVehicleList(Vehicle[] vehicles) {

        String hasMotor;
        System.out.println("-----------------------------------------------");
        System.out.println("--Lista de vehículos regristrados en el Ferry--");
        System.out.println("-----------------------------------------------");
        System.out.println("");

        try {
            for (int i = 0; i < vehicles.length; i++) {
                if (vehicles[i].transportType.equalsIgnoreCase("tierra")) {
                    if (vehicles[i].numberWheels == 4) {
                        Vehicle car = new Car(vehicles[i].identifier, vehicles[i].numberPassengers, vehicles[i].numberWheels,
                                vehicles[i].isCrewed, vehicles[i].registrationDate, vehicles[i].transportType);
                        car.VehicleType();
                    }
                    if (vehicles[i].numberWheels > 4) {
                        Vehicle truck = new Truck(vehicles[i].identifier, vehicles[i].numberPassengers, vehicles[i].numberWheels,
                                vehicles[i].isCrewed, vehicles[i].registrationDate, vehicles[i].transportType);
                        truck.VehicleType();
                    }
                    if (vehicles[i].numberWheels == 2) {
                        if (vehicles[i].numberPassengers == 2) {
                            Vehicle motorcycle = new Motorcycle(vehicles[i].identifier, vehicles[i].numberPassengers, vehicles[i].numberWheels,
                                    vehicles[i].isCrewed, vehicles[i].registrationDate, vehicles[i].transportType);
                            motorcycle.VehicleType();
                        }
                        if (vehicles[i].numberPassengers == 1) {
                            Vehicle bike = new Bike(vehicles[i].identifier, vehicles[i].numberPassengers, vehicles[i].numberWheels,
                                    vehicles[i].isCrewed, vehicles[i].registrationDate, vehicles[i].transportType);
                            bike.VehicleType();
                        }
                    }
                } else if (vehicles[i].transportType.equalsIgnoreCase("agua")) {
                    Vehicle boat = new Boat(vehicles[i].identifier, vehicles[i].numberPassengers, vehicles[i].numberWheels,
                            vehicles[i].isCrewed, vehicles[i].registrationDate, vehicles[i].transportType);
                    boat.VehicleType();
                } else {
                    System.out.println("Tipo de transporte no definido");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: No fue posible completar los datos no se puede mostrar lista");
        }
    }

    public void VehicleType() {
    }
}
