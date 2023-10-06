import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        // Creación de nueva instancia de model.Doctor
        Doctor doctor = new Doctor("Luis Hernandez", "Pediatria");
        doctor.addAvailableAppointment(new Date(), "10 am");
        doctor.addAvailableAppointment(new Date(), "1 pm");
        doctor.addAvailableAppointment(new Date(), "4 pm");
        /*
        for (model.Doctor.AvailableAppointment avaApp: doctor.getAvailableAppointments()) {
            System.out.println(avaApp.getDate() + "" + avaApp.getTime());
        }*/
        System.out.println(doctor);

        // Creación de nueva instancia de model.Patient
        Patient patient = new Patient("Mariam", "mariam@mail.com");
        patient.setWeight(54.6);
        patient.setPhoneNumber("12345678");
        patient.setAddress("Mexico, Tecamac");
        System.out.println(patient);
    }
}
