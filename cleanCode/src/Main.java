//5.2.1 el nombre del paquete debe estar escrito en lowercase
import personal.*;

public class Main {
    public static void main(String[] args) {
        Masajista masajista1 = new Masajista(1, "Pepe", "Torres", 32, "Terapeuta", 7);
        Futbolista futbolista1 = new Futbolista(2, "Pedro","Ruiz",24,10,"Defensa");
        Entrenador entrenador1 = new Entrenador(3,"Jose","Bustamante",38,143);

        masajista1.concentrarse();
        futbolista1.jugarPartido();
        entrenador1.dirigirPartido();
        masajista1.darMasaje(futbolista1);
        entrenador1.dirigirEntrenamiento();
        futbolista1.entrenar();
    }
}