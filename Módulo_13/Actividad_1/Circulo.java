package Módulo_13.Actividad_1;

public class Circulo extends Figura {

    protected Float radio;

    public Circulo(Float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (float) Math.PI * ((float) Math.pow(radio, 2));
    }

    @Override
    public float calcularPerimetro() {
        return (float) Math.PI * (radio * 2);
    }
}
