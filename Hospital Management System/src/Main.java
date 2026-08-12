import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(30);
        Scanner scanner = new Scanner(System.in);

        // Sample Data
        hospital.addPerson(new Doctor("Ahmed", 42, 12000, Department.CARDIOLOGY));
        hospital.addPerson(new Doctor("Mona", 35, 10000, Department.PEDIATRICS));
        hospital.addPerson(new Nurse("Sara", 28, 5000, Shift.NIGHT));
        hospital.addPerson(new Receptionist("Omar", 25, 4000));
        hospital.addPerson(new Patient("Mahmoud", 20, "Flu", 101));
        hospital.addPerson(new Patient("Ali", 50, "Heart issue", 102));
        hospital.addPerson(new Patient("Hassan", 30, "Fracture", 101));

        int choice = -1;
        while (choice != 0) {
            System.out.println("\n=== Hospital Management System ===");
            System.out.println("1. Print All People");
            System.out.println("2. Print Doctors");
            System.out.println("3. Print Patients");
            System.out.println("4. Search Doctor by Department");
            System.out.println("5. Show Total Employees Salary");
            System.out.println("6. Print Patients by Room Number");
            System.out.println("0. Exit");
            System.out.print("Select option: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                hospital.printAllPeople();
            } else if (choice == 2) {
                hospital.printDoctors();
            } else if (choice == 3) {
                hospital.printPatients();
            } else if (choice == 4) {
                System.out.println("Select Dept: 1. CARDIOLOGY  2. PEDIATRICS  3. ORTHOPEDIC  4. DENTISTRY");
                int d = scanner.nextInt();
                Department dept = Department.CARDIOLOGY;
                if (d == 2) dept = Department.PEDIATRICS;
                else if (d == 3) dept = Department.ORTHOPEDIC;
                else if (d == 4) dept = Department.DENTISTRY;

                hospital.searchDoctorByDept(dept);
            } else if (choice == 5) {
                System.out.println("Total Salaries = " + hospital.getTotalSalaries() + " EGP");
            } else if (choice == 6) {
                System.out.print("Enter Room Number: ");
                int room = scanner.nextInt();
                hospital.printPatientsInRoom(room);
            }
        }
    }
}