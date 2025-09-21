
package agendacontactos;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Contacto {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    // calcular edad dependiendo la fecha de nacimiento 
    private String telefonoCelular;
    private String email;
    
    //Constructor
    public Contacto(String nombre, String apellidoPaterno ,String apellidoMaterno, Date fechaNacimiento, String telefonoCelular, String email){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.telefonoCelular = telefonoCelular;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setFechaNacimiento(Date fechaDeNacimiento) {
        this.fechaNacimiento = fechaDeNacimiento;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //método calcular edad
    public int calcularEdad(LocalDate fechaNacimiento){
        if (fechaNacimiento == null){
            return 0;
        }
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNacimiento, hoy).getYears();
    }
    
    //toString
    @Override
    public String toString(){
        return nombre + apellidoMaterno + apellidoPaterno + fechaNacimiento + telefonoCelular + email;
    }
}
