public class Tecnico extends Operario{
    private int AñosAntiguedad;
    public Tecnico(){}
    public Tecnico(String nombre, int dni, int AñosAntiguedad){
        super(nombre, dni);
        this.AñosAntiguedad=AñosAntiguedad;
    }

    public int getAñosAntiguedad() {
        return AñosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        AñosAntiguedad = añosAntiguedad;
    }

    @Override
    public String toString() {
        return "Tecnico operario /Nombre: "+ getNombre() + "/ DNI: " + getDni() + "/ Años de antiguedad: " + AñosAntiguedad;
    }
    public String getDatosTecnico() {
        return "Nombre: " + getNombre() + ", DNI: " + getDni() + ", Años de Antigüedad: " + AñosAntiguedad;
    }
}
