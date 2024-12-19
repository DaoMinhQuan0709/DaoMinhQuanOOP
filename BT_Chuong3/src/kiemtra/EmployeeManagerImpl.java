package kiemtra;

public class EmployeeManagerImpl implements EmployeeManager{
	protected Employee[] employees;
	protected int size;
	
	public void EmployeeManagerImp1() {
		this.employees = new Employee[5];
		this.size = 0;
	}
	
	@Override
	public void addEmployee(Employee e) {
		if(size < 5) {
			employees[size] = e;
			size++;
		}
		else {
            System.out.println("Cannot add employee, array is full.");
        }
	}
	
	@Override
	public void editEmployee(Employee e) {
		for(int i = 0; i < size; i++) {
            if (employees[i].getUser_id() == e.getUser_id()) {
                employees[i] = e;
                System.out.println("Updated Employee: " + e);
                return;
            }
        }
        System.out.println("Employee not found!");
    }
	
	@Override
	public Employee searchEmployee(String fullname) {
		for(int i = 0; i < size; i++) {
			if(employees[i].getUser_fullname().equalsIgnoreCase(fullname)) {
				return employees[i];
			}
		}
		return null;
	}
	
	@Override
	public double getTotalSalary() {
		double total = 0;
		for(int i = 0; i < size; i++) {
			total += employees[i].getSalary();
		}
		return total;
	}
	
	// Phương thức hiển thị tất cả nhân viên
    public void displayAllEmployees() {
        System.out.println("Employee List:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}
