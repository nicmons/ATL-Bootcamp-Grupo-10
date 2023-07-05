package Módulo_13.Actividad_2;

public abstract class Personaje {
    protected String nombre;
    protected Integer nivel;
    protected Integer puntosVida;

    public Personaje(String nombre, Integer nivel, Integer puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public void atacar(Personaje personajeAtacado, Integer cantidadDano){
        if(verificarDesmayo(this)){
            System.out.println("Te has desmayado, no puedes atacar");
            System.out.println("---------------------------------");
        } else {
            personajeAtacado.puntosVida -= cantidadDano;
            System.out.println(nombre + " ataca a " + personajeAtacado.nombre);
            System.out.println("Cantidad de daño: " + cantidadDano);
            System.out.println("PV de " + personajeAtacado.nombre + ": " + personajeAtacado.puntosVida);
            verificarDesmayo(personajeAtacado);
            System.out.println("---------------------------------");
        }
    }
    public void recibirDano(Personaje personajeAtacante, Integer cantidadDano){
        if(verificarDesmayo(this)){
            System.out.println("Te has desmayado, no puedes recibir daño");
            System.out.println("---------------------------------");
        } else if (verificarDesmayo(personajeAtacante)){
            System.out.println(personajeAtacante.nombre + " esta desmayado, no puede atacarte");
            System.out.println("---------------------------------");
        } else {
            puntosVida -= cantidadDano;
            System.out.println(personajeAtacante.nombre + " te atacó");
            System.out.println("Cantidad de daño: " + cantidadDano);
            System.out.println("Tus PV de "+ puntosVida);
            verificarDesmayo(this);
            System.out.println("---------------------------------");
        }

    }
    public void curarse(Integer cantidadPv){
        if(verificarDesmayo(this)){
            System.out.println("Te has desmayado, no puedes curarte");
            System.out.println("---------------------------------");
        } else {
            puntosVida += cantidadPv;
            System.out.println("Te has curado: " + cantidadPv + " PV");
            System.out.println("Total de PV: " + puntosVida + " PV");
            System.out.println("---------------------------------");
        }

    }

    public boolean verificarDesmayo (Personaje personaje) {
        if(personaje.puntosVida <= 0){
            System.out.println(personaje.nombre + " se ha desmayado. Game Over.");
            return true;
        }
        return false;
    }

    public abstract void ataqueEspecial(Personaje personajeAtacao);
}
