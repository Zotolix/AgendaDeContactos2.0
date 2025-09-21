
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

public List<Contacto> eliminarContacto(String telefono){
	for (int i = 0; i<contactos.size(); i++){
		Contacto c = contactos.get(i);
		if(c.getTelefono().equals(telefono)){
			return contactos.remove(i);
		}
	}
	return null;
    
public List<Contacto> actualizarContacto(String telefono, String nuevoNombre,String nuevoApellido, String nuevoTelefono, String nuevoEmail, date nuevaFechaDeNacimiento ){
    for (Contacto c : contactos){
        if (c.getTelefono().equals(telefono)){
            c.setNombre(nuevoNombre);
            c.setTelefono(nuevoTelefono);
            c.setApellido(nuevoApellido);
            c.setEmail(nuevoEmail);
            c.setFechadeNacimiento(nuevaFechaDeNacimiento);
        }
        else{
            System.out.println("El contacto no se encontro o no existe ");
        }
    }
    }
public List<Contacto> verContacto(String telefono){
    for (int i=0; i<contactos.size(); i++){
        Contacto c = contactos.get(i);
        if (c.getTelefono.equals(telefono)){
            return c;
        }
    }
}
}
}

