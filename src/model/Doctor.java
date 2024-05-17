package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    // Atributos
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Constructor
    public Doctor(String name, String email) {
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
     * Muestra en pantalla la especialidad de un objeto de tipo model.Doctor.
     */
    public void showSpeciality() {
        System.out.println("model.Doctor Speciality: " + speciality);
    }

    /**
     * Añade un nuevo horario disponible para doctor.
     * @param date Fecha disponible
     * @param time Horario disponible
     */
    public void addAvailableAppointment(String date, String time) {
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
     * Sobrescribiendo el metodo toString() de model.User.
     * @return Datos del doctor.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nSpeciality: " + speciality +
                "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Oncología");
    }

    public static class AvailableAppointment {
        // Atributos
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        // Constructor
        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        // Getters & Setters
        public int getId() {
            return id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
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
