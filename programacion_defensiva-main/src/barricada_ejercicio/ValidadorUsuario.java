package barricada_ejercicio;

// clase barricada
public class ValidadorUsuario {

    // implementar método: validarCorreo(String correo)
    // aceptar emial que contengan @ y .
    public static String validarCorreo(String correo){                 
        if(correo == null || correo.isBlank()){
            return "";
        }
        if (!correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            return "";
        }

        return correo;
    }

    // implementar método: validarContrasena(String contrasena)
    // constraseña debe tener longitud mayor o igual a 8
    public static String validarContrasena(String contrasena){
        if(contrasena.length() < 8){
            return "";
        }

        return contrasena;
    }

    // implementar método: validarEdad(String edadTexto)
    // edad debe ser mayor o gual a 15 y menor o igual a 50
    public static int validarEdad(String edadTexto){
        int edad = Integer.parseInt(edadTexto);
        try {
            if(edad < 15) return 15;
            if(edad > 50) return 50;

            return edad;
        } catch (Exception e) {
            return 0;
        }
    }
    
}
