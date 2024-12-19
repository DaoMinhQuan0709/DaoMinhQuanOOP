package kiemtra;

public interface EmployeeManager {
	public void addEmployee(Employee e);
	public void editEmployee(Employee e);
	public Employee searchEmployee(String fullname);
	public double getTotalSalary();
}
