package personal;

//5.2.2 los nombres de las clases deben estar en UpperCamelCase.
public abstract class Persona {
    //5.2.6 el nombre de los parametros debe estar en lowerCamelCase.
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //5.2.3 los nombres de los metodos deben estar en  lowerCamelCase.
    public abstract void concentrarse();

    public abstract void viajar();

    public String getNombre() {
        return nombre;
    }
}
