package personal;

public class Futbolista extends Persona{

    private int numeroJugador;
    private String posicionEnCancha;

    public Futbolista(int id, String nombre, String apellido, int edad, int numeroJugador, String posicionEnCancha) {
        super(id, nombre, apellido, edad);
        this.numeroJugador = numeroJugador;
        this.posicionEnCancha = posicionEnCancha;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void jugarPartido(){
        System.out.printf("\nEl jugador numero %d esta jugando en la posicion de %s", numeroJugador, posicionEnCancha);
    }

    public void entrenar(){
        System.out.printf("\nEl jugador numero %d esta entrenando", numeroJugador);
    }

    @Override
    public void concentrarse() {
        System.out.printf("\nEl jugador numero %d esta entrenando", numeroJugador);
    }

    @Override
    public void viajar() {
        System.out.printf("\nEl jugador numero %d esta entrenando", numeroJugador);
    }
}
