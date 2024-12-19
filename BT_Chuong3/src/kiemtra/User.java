package kiemtra;

public abstract class User {
    // Thuộc tính
    protected int user_id;
    protected String user_name;
    protected String user_fullname;
    protected double user_cosalary;

    // Constructor mặc định
    public User() {
    }

    // Constructor đầy đủ tham số
    public User(int user_id, String user_name, String user_fullname, double user_cosalary) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_fullname = user_fullname;
        this.user_cosalary = user_cosalary;
    }

    // Getter và Setter
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_fullname() {
        return user_fullname;
    }

    public void setUser_fullname(String user_fullname) {
        this.user_fullname = user_fullname;
    }

    public double getUser_cosalary() {
        return user_cosalary;
    }

    public void setUser_cosalary(double user_cosalary) {
        this.user_cosalary = user_cosalary;
    }

    // Phương thức trừu tượng tính lương
    public abstract double getSalary();

    // Phương thức toString()
    @Override
    public String toString() {
        return "User ID: " + user_id + ", Name: " + user_name + ", Fullname: " + user_fullname + ", Co-salary: " + user_cosalary;
    }
}

