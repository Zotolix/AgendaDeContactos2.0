
package agendacontactos;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Contacto {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private LocalDate fechaNacimiento;
    // calcular edad dependiendo la fecha de nacimiento 
    private String telefonoCelular;
    private String email;

    public Contacto() {
    }
    
    //Constructor
    public Contacto(String nombre, String apellidoPaterno,
            String apellidoMaterno, LocalDate fechaNacimiento,
            String telefonoCelular, String email){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        /* validaciones centralizadas. como se hace con REGEX cada que se se 
        cree un contacto, se aplicará automáticamente**/
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

    public LocalDate getFechaNacimiento() {
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

    public void setFechaNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaNacimiento = fechaDeNacimiento;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        if (telefonoCelular != null && validarTelefono(telefonoCelular)){
            this.telefonoCelular = telefonoCelular;
        }else {
            throw new IllegalArgumentException ("Teléfono inválido. Deben ser 10 dígitos");
        }
    }

    public void setEmail(String email) {
        if (email != null && validarEmail(email)){
            this.email = email;
        }else{
            throw new IllegalArgumentException("Email inválido");
        }
    }
    
    //método calcular edad
    public int calcularEdad(){
        if (fechaNacimiento == null) return 0;
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    //period.between devuelve la edad a partir de la fecha de nacimiento
    
    public static boolean validarTelefono(String telefono){
        return Pattern.matches("\\d{10}",telefono); //revisa si el texto cumple con el patrón
    }
    
    public static boolean validarEmail(String email){
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$",email);
    }
    //toString
    @Override
    public String toString(){
        return nombre + apellidoMaterno + apellidoPaterno + fechaNacimiento + telefonoCelular + email;
    }
}
