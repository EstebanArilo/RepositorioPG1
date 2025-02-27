package co.uniquindio.edu.poo;

public class Ninio {

    private String nombre;
    private int edad;
    private String identificacion;
    private String sexo;
    private String alergias;
    private String nombreAc;
    private String idAc;

    public Ninio(String nombre, int edad, String identificacion, String sexo, String alergias, String nombreAc, String idAc) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.sexo = sexo;
        this.alergias = alergias;
        this.nombreAc = nombreAc;
        this.idAc = idAc;

    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public String getIdentificacion() {return identificacion;}
    public void setIdentificacion(String identificacion) {this.identificacion = identificacion;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}

    public String getAlergias() {return alergias;}
    public void setAlergias(String alergias) {this.alergias = alergias;}

    public String getNombreAc() {return nombreAc;}
    public void setNombreAc(String nombreAc) {this.nombreAc = nombreAc;}

    public String getIdAc() {return idAc;}
    public void setIdAc(String idAc) {this.idAc = idAc;}

    @Override
    public String toString() {
        return "Ninio{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", identificacion='" + identificacion + '\'' +
                ", sexo='" + sexo + '\'' +
                ", alergias='" + alergias + '\'' +
                ", nombreAc='" + nombreAc + '\'' +
                ", idAc='" + idAc + '\'' +
                '}';
    }
}

