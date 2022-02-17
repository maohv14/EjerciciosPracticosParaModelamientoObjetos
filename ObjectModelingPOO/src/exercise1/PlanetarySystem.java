package exercise1;


/**
 * Esta clase permite la abstracción de atributos como masa, densidad, diametro, distacia al sol,
 * nombre e identificar unico de un sistema planetario, Además de implementar un metodo o función
 * para calcular la atracción grativatoria
 *
 * @author Mauro Villada Villada, mauro1040@gmail.com
 * @version 1.0.0
 */
public class PlanetarySystem {
    private float mass;
    private float density;
    private float diameter;
    private float distanceToSun;
    private int identifierNumber;
    private String name;

    /**
     * Método contructor
     *
     * @param mass
     * @param density
     * @param diameter
     * @param distanceToSun
     * @param identifierNumber
     * @param name
     */
    public PlanetarySystem(float mass, float density, float diameter, float distanceToSun, int identifierNumber, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
        this.identifierNumber = identifierNumber;
        this.name = name;
    }

    /**
     * Métod para calcular la atracción gravitatoria entre dos cuerpos
     *
     * @param m1 Es la masa en Kilogramos de uno de los cuerpos
     * @param m2 Es la masa en Kilogramos del otro cuerpo
     * @param r  Es la distancia entre los cuerpos
     * @return se retonar el valor caculado (Fuerza de atracción entre los cuerpos)
     */
    public float GravitationalAttraction(float m1, float m2, float r) {
        final float G = (float) (6.67384 * (80) * ((int) Math.pow(10, -11)));
        float Fg = 0;
        Fg = (float) (G * ((m1 * m2) / (double) Math.pow(r, 2)));
        return Fg;

    }

    /**
     * Métodos getter y setter que permitiran obenter o modificar los atributos para cada objeto instanciado de esta clase
     *
     * @return
     */
    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(float distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public int getIdentifierNumber() {
        return identifierNumber;
    }

    public void setIdentifierNumber(int identifierNumber) {
        this.identifierNumber = identifierNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
