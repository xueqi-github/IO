public class Department {
    private Integer dept_id;
    private String dept_name;
    private Integer staff_number;

    public Department(Integer dept_id, String dept_name, Integer staff_number) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.staff_number = staff_number;
    }

    public Department() {
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Integer getStaff_number() {
        return staff_number;
    }

    public void setStaff_number(Integer staff_number) {
        this.staff_number = staff_number;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", staff_number=" + staff_number +
                '}';
    }
}
