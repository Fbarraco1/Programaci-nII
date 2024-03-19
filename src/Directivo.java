public class Directivo extends Empleado{
    private String departamento;
    public Directivo(){}
    public Directivo(String nombre, String departamento){
        super(nombre);
        this.departamento=departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String toString(){
        return "Directivo [nombre=" + getNombre() + " ] departamento" + departamento + " ";
    }
    public String getDatosDirectivo() {
        return "Nombre: " + getNombre() + ", Departamento: " + departamento;
    }
}
