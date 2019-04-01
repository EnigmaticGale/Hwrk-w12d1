package Staff;

abstract public class Employee {

    private String name;
    private int niNumber;
    private double salary;


    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase) {
        if (increase >= 1) {
            this.salary += increase;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
