
public class Main {
    public static void main(String[] args) {
        Directivo directivo = new Directivo("Luis Navales", "Ventas");
        Oficial oficial = new Oficial("Armando Esteban", 35345678, 35);
        Operario operario = new Operario("Jose Rosales", 29654321);
        Tecnico tecnico = new Tecnico("Ana Caballero", 40765432, 10);

        System.out.println("Datos del Directivo:");
        System.out.println(directivo.getDatosDirectivo());

        System.out.println("\nDatos del Oficial:");
        System.out.println(oficial.getDatosOficial());

        System.out.println("\nDatos del Operario:");
        System.out.println(operario.getDatosOperario());

        System.out.println("\nDatos del Técnico:");
        System.out.println(tecnico.getDatosTecnico());
    }
}