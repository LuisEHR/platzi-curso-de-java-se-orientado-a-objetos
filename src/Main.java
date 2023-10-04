import java.util.Date;
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor doctor = new Doctor("Luis Hernandez", "Pediatria");
        doctor.showName();
        doctor.showSpeciality();

        Patient patient = new Patient("Mariam", "mariam@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        doctor.addAvailableAppointment(new Date(), "10 am");
        doctor.addAvailableAppointment(new Date(), "1 pm");
        doctor.addAvailableAppointment(new Date(), "4 pm");
        for (Doctor.AvailableAppointment avaApp: doctor.getAvailableAppointments()) {
            System.out.println(avaApp.getDate() + "" + avaApp.getTime());
        }
    }
}
