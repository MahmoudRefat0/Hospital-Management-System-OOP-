public abstract class Employee extends Person {
    protected double baseSalary;

    public Employee(String name, int age, double baseSalary) {
        super(name, age);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();
}