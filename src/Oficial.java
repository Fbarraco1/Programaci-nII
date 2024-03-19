public class Oficial extends Operario{
    private int edad;
    public Oficial(){}
    public Oficial(String nombre, int dni, int edad){
        super(nombre, dni);
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public String getDatosOficial() {
        return "Nombre: " + getNombre() + ", DNI: " + getDni() + ", Edad: " + edad;
    }
}
