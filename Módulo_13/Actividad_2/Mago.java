package Módulo_13.Actividad_2;

public class Mago extends Personaje {

    public Mago(String nombre, Integer nivel, Integer puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void ataqueEspecial(Personaje personajeAtacado) {
        System.out.println("Ataque especial clase Mago: Estrella celestial");
        atacar(personajeAtacado, 85);
    }

}
