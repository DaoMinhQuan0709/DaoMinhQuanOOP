package kiemtra;

public class Employee extends User {
    // Thuộc tính riêng của Employee
    protected double employee_basic_salary;
    protected String employee_department;

    // Constructor
    public Employee() {
    }

    public Employee(int user_id, String user_name, String user_fullname, double user_cosalary, double employee_basic_salary, String employee_department) {
        super(user_id, user_name, user_fullname, user_cosalary);
        this.employee_basic_salary = employee_basic_salary;
        this.employee_department = employee_department;
    }

    // Getter và Setter
    public double getEmployee_basic_salary() {
        return employee_basic_salary;
    }

    public void setEmployee_basic_salary(double employee_basic_salary) {
        this.employee_basic_salary = employee_basic_salary;
    }

    public String getEmployee_department() {
        return employee_department;
    }

    public void setEmployee_department(String employee_department) {
        this.employee_department = employee_department;
    }

    // Ghi đè phương thức getSalary()
    @Override
    public double getSalary() {
        double allowance = 0.0;
        switch (employee_department.toLowerCase()) {
            case "nhan su":
                allowance = 1.0;
                break;
            case "kinh doanh":
                allowance = 1.5;
                break;
            case "quan tri":
                allowance = 2.0;
                break;
            default:
                allowance = 1.0;
        }
        return employee_basic_salary * getUser_cosalary() + allowance * 1000;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return super.toString() + ", Basic Salary: " + employee_basic_salary + ", Department: " + employee_department + ", Total Salary: " + getSalary();
    }
}
