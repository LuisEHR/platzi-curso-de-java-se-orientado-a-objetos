public class DiffVariableObject {
    public static void main(String[] args) {
        /* Variables */
        int i = 0;
        int b = 2;
        // b ahora vale 0
        b = i;

        /* Objetos */
        Patient newPatient = new Patient("Alejandra", "alejandra@mail.com");
        Patient newPatient2 = new Patient("Anahi", "anahi@mail.com");
        // newPatient2 ahora apuntan a la misma localidad de memoria
        newPatient2 = newPatient;
    }
}
