import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    // Atributos
    private String speciality;

    // Constructor
    Doctor(String name, String email) {
        super(name, email);
    }

    // Getters & Setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // Metodos

    /**
     * Muestra en pantalla la especialidad de un objeto de tipo Doctor.
     */
    public void showSpeciality() {
        System.out.println("Doctor Speciality: " + speciality);
    }

    /**
     * Añade un nuevo horario disponible para doctor.
     * @param date Fecha disponible
     * @param time Horario disponible
     */
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    /**
     * Regresa los horarios disponibles de un doctor.
     * @return Horarios disponibles de un doctor.
     */
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    /**
     * Sobrescribiendo el metodo toString() de User.
     * @return Datos del doctor.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nSpeciality: " + speciality +
                "\nAvailable: " + availableAppointments.toString();
    }

    public static class AvailableAppointment {
        // Atributos
        private int id;
        private Date date;
        private String time;

        // Constructor
        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        // Getters & Setters
        public int getId() {
            return id;
        }

        public Date getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

        // Metodos

        /**
         * Sobrescribiendo el metodo toString() de Object.
         * @return Horarios del doctor disponibles.
         */
        @Override
        public String toString() {
            return "Available Appointments:" +
                    "\nDate: " + date +
                    "\nTime: " + time;
        }
    }
}
