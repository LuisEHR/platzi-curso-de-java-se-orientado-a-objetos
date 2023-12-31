package model;

public class Patient extends User {
    // Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    // Constructor
    public Patient(String name, String email) {
        super(name, email);
    }

    // Getters & Setters
    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    // Metodos

    /**
     * Sobrescribiendo el metodo toString() de model.User.
     * @return super.toString() + datos del paciente.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nAge: " + birthday +
                "\nWeight: " + getWeight() +
                "\nHeight: " + getHeight() +
                "\nBlood: " + blood;
    }
}
