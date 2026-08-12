public class Patient extends Person {
    private String disease;
    private int roomNo;

    public Patient(String name, int age, String disease, int roomNo) {
        super(name, age);
        this.disease = disease;
        this.roomNo = roomNo;
    }

    public String getDisease() { return disease; }
    public int getRoomNo() { return roomNo; }

    public void receiveTreatment() {
        System.out.println("Patient " + name + " is receiving treatment for " + disease);
    }

    @Override
    public void introduce() {
        System.out.println("Patient: " + name + " | Age: " + age + " | Disease: " + disease + " | Room: " + roomNo);
    }
}