public class Usuario {
    int id;
    String Nombre;
    String Apellido;
    String Usuario;
    String Contraseña;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String usuario, String contraseña)  {
        Nombre = nombre;
        Apellido = apellido;
        Usuario = usuario;
        Contraseña = contraseña;

    }

    public boolean isNull(){
        if(Nombre.equals("") && Apellido.equals("")&&Usuario.equals("")&&Contraseña.equals("")){
            return false;
        }else {
            return true;
        }
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Nombre=" + Nombre +
                ", Apellido=" + Apellido +
                ", Usuario=" + Usuario +
                ", Contraseña=" + Contraseña +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(string nombre) {
        Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(string apellido) {
        Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(string usuario) {
        Usuario = usuario;
    }

    public string getContraseña() {
        return Contraseña;
    }

    public void setContraseña(string contraseña) {
        Contraseña = Contraseña;
    }
}

