package Módulo_13.Actividad_1;

import java.util.List;

public class Rectangulo extends PoligonoRegular {

    public Rectangulo(List<Float> lados, float base, float altura) {
        super(lados, base, altura);
    }

    @Override
    public float calcularArea() {
        return base * altura;
    }

}
