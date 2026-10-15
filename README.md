# 🏥 Hospital Management System

A console-based Java application that models a hospital's staff and patients, built to practise **inheritance, abstraction and polymorphism**.

## Features
- Manage doctors, nurses, receptionists and patients in one hospital
- List everyone, only doctors, or only patients
- Search doctors by department (`CARDIOLOGY`, `PEDIATRICS`, `ORTHOPEDIC`, `DENTISTRY`)
- Calculate total salaries (each role has its own salary rule)
- List patients by room number
- Staff work in shifts (`MORNING`, `EVENING`, `NIGHT`)

## Concepts used
| Concept | Where |
| --- | --- |
| Abstraction | Abstract `Person` and `Employee` classes |
| Inheritance | `Doctor`, `Nurse`, `Receptionist` → `Employee` → `Person`; `Patient` → `Person` |
| Polymorphism | `calculateSalary()` and `introduce()` overridden per role |
| `instanceof` | Filtering doctors and patients from one list |
| Enums | `Department`, `Shift` |

## Project structure
```
Hospital Management System/src
├── Main.java           # Console menu
├── Hospital.java       # Business logic
├── Person.java         # Abstract
├── Employee.java       # Abstract
├── Doctor.java
├── Nurse.java
├── Receptionist.java
├── Patient.java
├── Department.java
└── Shift.java
```

## How to run
1. Open the `Hospital Management System` folder in IntelliJ IDEA (JDK 17+).
2. Run `Main.java`.

Or from the terminal:
```bash
cd "Hospital Management System/src"
javac *.java && java Main
```
