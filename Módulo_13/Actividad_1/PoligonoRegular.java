package Módulo_13.Actividad_1;

import java.util.List;

public abstract class PoligonoRegular extends Figura {
    protected List<Float> lados;
    protected float base;
    protected float altura;

    public PoligonoRegular(List<Float> lados, float base, float altura) {
        this.lados = lados;
        this.base = base;
        this.altura = altura;
    }

    public float calcularPerimetro() {
        float sumaLados = 0;
        for (Float lado: lados){
            sumaLados += lado;
        }
        return sumaLados;
    }
}
