class Person {

    private String name;
    private int id;

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Employee extends Person {

    String rol;
    int timeInCompany;
    double salary;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getTimeInCompany() {
        return timeInCompany;
    }

    public void setTimeInCompany(int timeInCompany) {
        this.timeInCompany = timeInCompany;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int id) {
        super(name, id);
    }

    public Employee(String name, int id, String rol, int timeInCompany, double salary) {
        super(name, id);
        this.rol = rol;
        this.timeInCompany = timeInCompany;
        this.salary = salary;
    }

    public double getSalaryByAge() {
        double salaryBonification = 0d;
        if (this.timeInCompany > 2 && this.timeInCompany <= 5) {
            salaryBonification = this.salary + this.salary * 0.05;
        } else if (this.timeInCompany > 5 && this.timeInCompany <= 8) {
            salaryBonification = this.salary + this.salary * 0.1;
        } else if (this.timeInCompany > 8 && this.timeInCompany <= 15) {
            salaryBonification = this.salary + this.salary * 0.15;
        } else if (this.timeInCompany > 15) {
            salaryBonification = this.salary + this.salary * 0.25;
        }
        return salaryBonification;
    }

}