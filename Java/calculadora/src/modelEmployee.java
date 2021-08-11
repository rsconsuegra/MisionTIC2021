public class modelEmployee {

    public modelEmployee() {

    }

    public String getMaxSalaryBonification(Employee[] employees, int n) {
        double max_salary = 0;
        String name = "";
        double employee_salary = 0;
        for (int i = 0; i < n; i++) {
            employee_salary = employees[i].getSalaryByAge();
            if (employee_salary > max_salary) {
                max_salary = employee_salary;
                name = employees[i].getName();
            }
        }
        return name + " has a salary of " + Double.toString(max_salary);
    }

}
