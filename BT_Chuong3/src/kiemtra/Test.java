package kiemtra;

public class Test {

	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManagerImpl();
		
		// them nhan vien
		Employee e1 = new Employee(1,"user1","Nguyen Van A",2.0,5000,"Kinh doanh");
		Employee e2 = new Employee(2, "user2", "Tran Thi B", 1.5, 4000, "Nhan su");
        Employee e3 = new Employee(3, "user3", "Le Van C", 1.8, 4500, "Quan tri");
        
        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);
        
        //vhien thi tat ca nv
        ((EmployeeManagerImpl) manager).displayAllEmployees();
        
        // tim nv
       Employee searchResult = manager.searchEmployee("Tran Thi B");
       if(searchResult != null) {
    	   System.out.print("ket qua tim kiem "+ searchResult);
       }
       else {
    	   System.out.println("Employee not found!");
       }
       
    // Tính tổng lương
       double totalSalary = manager.getTotalSalary();
       System.out.println("Total Salary: " + totalSalary);
       
	}

}
