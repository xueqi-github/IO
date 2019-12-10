public class Person {
    private Integer PId;
    private String name;
    private Integer age;
    private Boolean sex;

    public Person(Integer PId, String name, Integer age, Boolean sex) {
        this.PId = PId;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    public Integer getPId() {
        return PId;
    }

    public void setPId(Integer PId) {
        this.PId = PId;
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

    @Override
    public String toString() {
        return "Person{" +
                "PId=" + PId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
