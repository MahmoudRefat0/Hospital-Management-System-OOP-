public class Nurse extends Employee {
    private Shift shift;

    public Nurse(String name, int age, double baseSalary, Shift shift) {
        super(name, age, baseSalary);
        this.shift = shift;
    }

    public Shift getShift() { return shift; }

    public void assistDoctor() {
        System.out.println("Nurse " + name + " is assisting the doctor.");
    }

    public void schedulePatient() {
        System.out.println("Nurse " + name + " is scheduling a patient.");
    }

    @Override
    public double calculateSalary() {
        // Night shift gets bonus
        if (shift == Shift.NIGHT) {
            return baseSalary + 500.0;
        }
        return baseSalary;
    }

    @Override
    public void introduce() {
        System.out.println("Nurse: " + name + " | Age: " + age + " | Shift: " + shift + " | Salary: " + calculateSalary() + " EGP");
    }
}