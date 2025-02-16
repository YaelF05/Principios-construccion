package personal;

public class Masajista extends Persona{

    private String profesion;
    private int anosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String profesion, int anosExperiencia) {
        super(id, nombre, apellido, edad);
        this.profesion = profesion;
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaje(Futbolista futbolista){
        System.out.printf("\nEl masajista %s le esta dando un masaje al jugador numero %d",getNombre(), futbolista.getNumeroJugador());
    }

    // 6.1 @Override siempre se utiliza al sobrescribir un metodo de una clase
    @Override
    public void concentrarse() {
        System.out.printf("\nEl masajista %s esta concentrado",getNombre());
    }

    @Override
    public void viajar() {
        System.out.printf("\nEl masajista %s esta viajando",getNombre());
    }
}
