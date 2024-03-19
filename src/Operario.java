public class Operario extends Empleado{
    private int dni;
    public Operario(){}
    public Operario(String nombre, int dni){
        super(nombre);
        this.dni=dni;
    }
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Operario: Nombre: "+ getNombre() + "DNI: " + dni;
    }
    public String getDatosOperario() {
        return "Nombre: " + getNombre() + ", DNI: " + dni;
    }
}
