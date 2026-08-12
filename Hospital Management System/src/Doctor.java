public class Doctor extends Employee {
    private Department dept;

    public Doctor(String name, int age, double baseSalary, Department dept) {
        super(name, age, baseSalary);
        this.dept = dept;
    }

    public Department getDept() { return dept; }

    public void treatPatient(Patient p) {
        System.out.println("Doctor " + name + " is treating patient " + p.getName());
    }

    public void scheduleApp() {
        System.out.println("Doctor " + name + " scheduled a new appointment.");
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // basic salary logic
    }

    @Override
    public void introduce() {
        System.out.println("Doctor: " + name + " | Age: " + age + " | Department: " + dept + " | Salary: " + calculateSalary() + " EGP");
    }
}