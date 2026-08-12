public class Hospital {
    private Person[] people;
    private int count;

    public Hospital(int capacity) {
        people = new Person[capacity];
        count = 0;
    }

    public boolean addPerson(Person p) {
        if (count < people.length) {
            people[count++] = p;
            return true;
        }
        return false;
    }

    // Print all people
    public void printAllPeople() {
        System.out.println("\n--- All People in Hospital ---");
        for (int i = 0; i < count; i++) {
            people[i].introduce();
        }
    }

    // Print only doctors
    public void printDoctors() {
        System.out.println("\n--- Doctors List ---");
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Doctor) {
                people[i].introduce();
            }
        }
    }

    // Print only patients
    public void printPatients() {
        System.out.println("\n--- Patients List ---");
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Patient) {
                people[i].introduce();
            }
        }
    }

    // Feature 1: Search doctor by department
    public void searchDoctorByDept(Department dept) {
        System.out.println("\n--- Searching Doctors in " + dept + " ---");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Doctor) {
                Doctor doc = (Doctor) people[i];
                if (doc.getDept() == dept) {
                    doc.introduce();
                    found = true;
                }
            }
        }
        if (!found) System.out.println("No doctors found in this department.");
    }

    // Feature 2: Total salaries of all employees
    public double getTotalSalaries() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Employee) {
                Employee emp = (Employee) people[i];
                total += emp.calculateSalary();
            }
        }
        return total;
    }

    // Feature 3: Print patients in a specific room
    public void printPatientsInRoom(int roomNo) {
        System.out.println("\n--- Patients in Room " + roomNo + " ---");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Patient) {
                Patient p = (Patient) people[i];
                if (p.getRoomNo() == roomNo) {
                    p.introduce();
                    found = true;
                }
            }
        }
        if (!found) System.out.println("No patients found in room " + roomNo);
    }
}