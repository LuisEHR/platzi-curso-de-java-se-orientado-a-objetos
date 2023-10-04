import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // Atributos
    private static int id = 0;
    private String name;
    private String email;
    private String speciality;

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

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public Date getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }
    }
}
