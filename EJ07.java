public class EJ07 {
    public static void main(String[] args) {
        class AlumnoMatriculado {
            int edadAlumno = 19;
            void mostrarEdad() {
                System.out.println(edadAlumno);
            }
        }
        AlumnoMatriculado alumno = new AlumnoMatriculado();
        alumno.mostrarEdad();
    }
}