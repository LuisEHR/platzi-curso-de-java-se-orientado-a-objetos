public class Patient {
    // Atributos
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    /**
     * Metodo constructor de un objeto de tipo Patient.
     * @param name
     * @param email
     */
    public Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
