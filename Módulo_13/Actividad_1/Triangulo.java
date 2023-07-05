package Módulo_13.Actividad_1;

import java.util.List;

public class Triangulo extends PoligonoRegular {

    public Triangulo(List<Float> lados, float base, float altura) {
        super(lados, base, altura);
    }

    @Override
    public float calcularArea() {
        return base * altura / 2;
    }
}
