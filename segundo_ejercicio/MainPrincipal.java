package segundo_ejercicio;

public class MainPrincipal {
    public static void main(String[] args) {
        try {

            int[] notas = { 19, 18, 17 };
            estudiante Estudiante = new estudiante("Alexander Benito Ordonez Torres", notas);
            System.out
                    .println("El promedio de " + Estudiante.getNombre() + " es de: " + Estudiante.caluladoraPromedio());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
