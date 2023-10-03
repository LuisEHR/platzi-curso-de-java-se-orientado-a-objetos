import javax.print.Doc;

public class Doctor {
    // Atributos
    static int id = 0;
    String name;
    String email;
    String speciality;

    // Comportamientos

    /**
     * Metodo constructor de un objeto de tipo Doctor.
     */
    public Doctor() {}

    /**
     * Metodo constructor de un objeto de tipo Doctor. (Sobrecarga)
     * @param name Nombre del doctor.
     * @param speciality Especialidad del doctor.
     */
    public Doctor(String name, String speciality) {
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    /**
     * Muestra en pantalla el id de un objeto de tipo Doctor.
     */
    public void showId() {
        System.out.println("Doctor Id: " + id);
    }

    /**
     * Muestra en pantalla el nombre de un objeto de tipo Doctor.
     */
    public void showName() {
        System.out.println("Doctor Name: " + name);
    }

    /**
     * Muestra en pantalla la especialidad de un objeto de tipo Doctor.
     */
    public void showSpeciality() {
        System.out.println("Doctor Speciality: " + speciality);
    }
}
