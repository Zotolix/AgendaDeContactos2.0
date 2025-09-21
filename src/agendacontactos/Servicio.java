
package agendacontactos;
import java.util.*;

public class Servicio{
    private ArrayList<Contacto> contacto = new ArrayList<>();
    
    public void registrarContacto(String nombre, String apellidoPaterno, String apellidoMaterno, String email, String telefono, date fechaNacimiento){
        Contacto nuevoContacto = new Contacto (nombre, apellidoPaterno, apellidoMaterno, email, telefono, fechaNacimiento);
        Contacto.add(nuevoContacto);
    }

}




