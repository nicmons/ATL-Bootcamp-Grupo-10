package Módulo_13;

import Módulo_13.Actividad_1.Circulo;
import Módulo_13.Actividad_1.Rectangulo;
import Módulo_13.Actividad_1.Triangulo;
import Módulo_13.Actividad_2.Arquero;
import Módulo_13.Actividad_2.Guerrero;
import Módulo_13.Actividad_2.Mago;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Actividad 1 */

        List<Float> lados = new ArrayList<>();
        lados.add(6.0f);
        lados.add(6.0f);
        lados.add(4.0f);
        lados.add(4.0f);
        Rectangulo rectangulo = new Rectangulo(lados, 5, 6);
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());

        lados.clear();
        lados.add(6.0f);
        lados.add(6.0f);
        lados.add(4.0f);
        Triangulo triangulo = new Triangulo(lados, 5, 6);
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());
        System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());

        Circulo circulo = new Circulo(3.0f);
        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro() + "\n \n");

        /* Actividad 2 */

        Guerrero guerrero = new Guerrero("Melodias", 1, 100);
        Arquero arquero = new Arquero("Logan", 1, 100);
        Mago mago = new Mago("Harry", 1, 100);

        guerrero.atacar(arquero, 40);
        guerrero.recibirDano(arquero, 30);
        arquero.atacar(mago, 15);
        guerrero.curarse(30);
        arquero.curarse(15);
        guerrero.ataqueEspecial(arquero);
        mago.ataqueEspecial(guerrero);
        arquero.recibirDano(mago, 15);
        arquero.ataqueEspecial(mago);

    }
}
