
package servicio;


import java.util.ArrayList;
import java.util.List;
import model.Contacto;

public class Agenda {
    private final List<Contacto> contactos;
    
    public Agenda(){
        this.contactos = new ArrayList<>();
    }
public List<Contacto> getContactos(){
return contactos;
} 

public void agregarContacto(Contacto c){
    contactos.add(c);
}
public List<Contacto> buscarPorNombre(String nombre){
    List<Contacto> resultado = new ArrayList<>();
    for (Contacto c : contactos){
        if (c.getNombre().equalsIgnoreCase(nombre)){
            resultado.add(c);
        }
    }
    return resultado;
}
}
