package ui;

import model.Doctor;
import model.Patient;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Select an option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    System.out.println("Patient");
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martínez", "alejando.m@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen.s@mail.com"));
        doctors.add(new Doctor("Rocío Gómez", "rocio.g@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahí Salgado", "anahi.s@mail.com"));
        patients.add(new Patient("Roberto Rodríguez", "roberto.r@mail.com"));
        patients.add(new Patient("Carlos Sanchez", "carlos.s@mail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@mail.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            // Doctor
            if (userType == 1) {
                for(Doctor doc: doctors) {
                    if (doc.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener los datos del usuario logeado
                        doctorLogged = doc;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            // Patient
            if (userType == 2) {
                for(Patient pat: patients) {
                    if (pat.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener los datos del usuario logeado
                        patientLogged = pat;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        } while (!emailCorrect);
    }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
}
