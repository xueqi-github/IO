import java.io.*;
import java.util.Date;

public class Reportor {
    private Integer number;
    private String schoolName;
    private String deptName;
    private String stuName;
    private String path;
    private String content;

    public Reportor(Integer number, String schoolName, String deptName, String stuName, String path, String content) {
        this.number = number;
        this.schoolName = schoolName;
        this.deptName = deptName;
        this.stuName = stuName;
        this.path = path;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Reportor{" +
                "number=" + number +
                ", schoolName='" + schoolName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", stuName='" + stuName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public void writeReports(String content) throws IOException {
        File file = new File(this.path);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file));
        writer.write(content);
        writer.close();
    }

}
