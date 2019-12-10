import java.util.Date;

public class SchDeptShip {
    private Integer number;
    private String schoolName;
    private String deptName;
    private String stuName;
    private Date data;
    private String str;

    public SchDeptShip(Integer number, String schoolName, String deptName, String stuName, Date data, String str) {
        this.number = number;
        this.schoolName = schoolName;
        this.deptName = deptName;
        this.stuName = stuName;
        this.data = data;
        this.str = str;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "SchDeptShip{" +
                "number=" + number +
                ", schoolName='" + schoolName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", stuName='" + stuName + '\'' +
                ", data=" + data +
                ", str='" + str + '\'' +
                '}';
    }
}
