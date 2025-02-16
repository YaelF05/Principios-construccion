package personal;

public class Entrenador extends Persona{

    private int idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido(){
        System.out.printf("\nEl entrenador %s dirige el partido", getNombre());
    }

    public void dirigirEntrenamiento(){
        System.out.printf("\nEl entrenador %s dirige el entrenamiento", getNombre());
    }

    @Override
    public void concentrarse() {
        System.out.printf("\nEl entrenador %s se esta concetrando", getNombre());
    }

    @Override
    public void viajar() {
        System.out.printf("\nEl entrenador %s esta viajando", getNombre());
    }
}
