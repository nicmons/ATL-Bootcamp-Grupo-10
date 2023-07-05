package Módulo_13.Actividad_2;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, Integer nivel, Integer puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void ataqueEspecial(Personaje personajeAtacado) {
        System.out.println("Ataque especial clase Guerrero: Fuerza bruta");
        atacar(personajeAtacado, 60);
    }
}
