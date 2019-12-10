import java.util.List;

public class Department {
    private Integer deptId;
    private String name;
    private List<Student> student;

    public Department() {
    }

    public Department(Integer deptId, String name, List<Student> student) {
        this.deptId = deptId;
        this.name = name;
        this.student = student;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
