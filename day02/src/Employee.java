public class Employee extends Person{
    private Integer time_come;
    private Integer time_leave;
    private Integer salary;

    public Employee(Integer PId, String name, Integer age, Boolean sex, Integer time_come, Integer time_leave, Integer salary) {
        super(PId, name, age, sex);
        this.time_come = time_come;
        this.time_leave = time_leave;
        this.salary = salary;
    }
    public Employee(){

    }

    public Integer getTime_come() {
        return time_come;
    }

    public void setTime_come(Integer time_come) {
        this.time_come = time_come;
    }

    public Integer getTime_leave() {
        return time_leave;
    }

    public void setTime_leave(Integer time_leave) {
        this.time_leave = time_leave;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "time_come=" + time_come +
                ", time_leave=" + time_leave +
                ", salary=" + salary +
                '}';
    }
}
