public class School {
    private Integer schoolId;
    private String name;
    private String address;

    public School(Integer schoolId, String name, String address) {
        this.schoolId = schoolId;
        this.name = name;
        this.address = address;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
