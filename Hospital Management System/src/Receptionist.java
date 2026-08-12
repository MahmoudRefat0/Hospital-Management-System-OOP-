public class Receptionist extends Employee {

    public Receptionist(String name, int age, double baseSalary) {
        super(name, age, baseSalary);
    }

    public void scheduleAppointment() {
        System.out.println("Receptionist " + name + " booked an appointment.");
    }

    public void registerPatient() {
        System.out.println("Receptionist " + name + " registered a patient.");
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void introduce() {
        System.out.println("Receptionist: " + name + " | Age: " + age + " | Salary: " + calculateSalary() + " EGP");
    }
}