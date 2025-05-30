package control;

public class LoginControler {
    
    //Datos

    String[][] credenciales = {
        {"sajimenez", "figaroelmejor"},
        {"mlopez", "clave123"},
        {"cfernandez", "pass456"},
        {"arodriguez", "admin2025"},
        {"dcruz", "delta789"},
        {"lmartinez", "lm1234"},
        {"kramirez", "kr_secure"},
        {"jperez", "jpz_pass"},
        {"bgomez", "bgo2025"},
        {"ncastillo", "ncasclave"},
        {"vtorres", "vt0101"}
    };    
    public boolean validacionDatos (String Entradausuario, String Entradacontrasena){
        for (int i = 0; i < credenciales.length; i++) {
            if (credenciales[i][0].equals(Entradausuario) && credenciales[i][1].equals(Entradacontrasena)) {
                return true;
            }
        }
        return false;
    }
}