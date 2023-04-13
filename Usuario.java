public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private int numero;
    private String estadoCivil;
    private String ciudad;

    public Usuario(String nombre, String apellido, String correo, int numero, String estadoCivil, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero = numero;
        this.estadoCivil = estadoCivil;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
