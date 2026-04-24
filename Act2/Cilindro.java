package Act2;

/**
 * Clase Cilindro.
 */
public class Cilindro {
    /**
     * Variable Radio
     */
    double radio, /**
     * Variable Altura.
     */
    altura, /**
     * Varible Altura Base.
     */
    Ab, /**
     * Varible Altura lateral.
     */
    Al, /**
     * Variable Altura total.
     */
    At, /**
     * Variable Volumen.
     */
    Volumen;

    /**
     * El constructor
     *
     *
     *
     */
    public Cilindro(double radio, double altura, double ab, double at, double al, double volumen) {
        this.radio = radio;
        this.altura = altura;
        Ab = ab;
        At = at;
        Al = al;
        Volumen = volumen;
    }

    /**
     * Getters y Setters
     *
     *
     */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAb() {
        return Ab;
    }

    public void setAb(double ab) {
        Ab = ab;
    }

    public double getAl() {
        return Al;
    }

    public void setAl(double al) {
        Al = al;
    }

    public double getAt() {
        return At;
    }

    public void setAt(double at) {
        At = at;
    }

    public double getVolumen() {
        return Volumen;
    }

    public void setVolumen(double volumen) {
        Volumen = volumen;
    }

    /**
     * Calcular area altura double.
     *
     * @return the double
     */
    public double calcularAreaAltura(){
        Al = 2*3.14*radio*altura;
    return Al;
    }

    /**
     * Calcular area base.
     *
     * @return area Base
     */
    public double calcularAreaBase(){
        Ab = 3.14*(radio*radio);
        return Ab;
    }

    /**
     * Calcular areatotal.
     *
     * @return Area total
     */
    public double calcularAreatotal(){
        At = 2*Ab+Al;
        return At;
    }

    /**
     * Calcular volumen.
     *
     * @return volumen
     */
    public double calcularVolumen(){
        Volumen = 3.14*(radio*radio)*altura;
        return Volumen;
    }
}