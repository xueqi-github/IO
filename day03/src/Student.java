public class Student {
    private Integer stuId;
    private String name;
    private Integer age;
    private Boolean sex;

    public Student(Integer stuId, String name, Integer age, Boolean sex) {
        this.stuId = stuId;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}
