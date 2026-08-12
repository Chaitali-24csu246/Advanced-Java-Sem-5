
## Objective

Build a mini Java application that demonstrates all OOP pillars.

## Project Structure

``` text
CollegeERP/
├── Main.java
├── Person.java (abstract)
├── Student.java
├── Faculty.java
├── Admin.java
├── Payable.java
├── Reportable.java
```

## Person (abstract)

-   name
-   email
-   phone
-   login()
-   abstract displayDashboard()

## Student

Extends Person Implements Payable, Reportable

Fields: - rollNo - cgpa

Methods: - payFees() - generateReport() - displayDashboard()

## Faculty

Extends Person Implements Reportable

Fields: - designation - salary

Methods: - generateReport() - displayDashboard()

## Admin

Extends Person Implements Reportable

Fields: - role - officeLocation

## Main.java Demo

1.  Create Student, Faculty, Admin objects.
2.  Store them in `Person[]`.
3.  Invoke `displayDashboard()` to demonstrate runtime polymorphism.
4.  Invoke interface methods where applicable.

## Concepts Covered

-   Classes & Objects
-   Constructors
-   this
-   Encapsulation
-   Inheritance
-   Polymorphism
-   Abstraction
-   Interfaces
