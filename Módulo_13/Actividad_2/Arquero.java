package Módulo_13.Actividad_2;

public class Arquero extends Personaje {

    public Arquero(String nombre, Integer nivel, Integer puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void ataqueEspecial(Personaje personajeAtacado) {
        System.out.println("Ataque especial clase Arquero: Vendaval de flechas");
        atacar(personajeAtacado, 75);
    }

}
