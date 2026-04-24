package Act2;

public class Cilindro {
    double radio,altura,Ab,Al,At,Volumen;

    public Cilindro(double radio, double altura, double ab, double at, double al, double volumen) {
        this.radio = radio;
        this.altura = altura;
        Ab = ab;
        At = at;
        Al = al;
        Volumen = volumen;
    }

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

    public double calcularAreaAltura(){
        double Al = 2*3.14*radio*altura;
        double Ab = 3.14*(radio*radio);
    return Al;
    }
    public double calcularAreaBase(){
        double Ab = 3.14*(radio*radio);
        return Ab;
    }
    public double calcularAreatotal(){
        double At = 2*Ab+Al;
        return At;
    }

    public double calcularVolumen(){
        double Volumen = 3.14*(radio*radio)*altura;
        return Volumen;
    }
}