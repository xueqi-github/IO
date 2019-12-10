public class Company {
    private Integer company_number;
    private String name;
    private Integer login_money;
    private Integer company_type;

    public Company(Integer company_number, String name, Integer login_money, Integer company_type) {
        this.company_number = company_number;
        this.name = name;
        this.login_money = login_money;
        this.company_type = company_type;
    }

    public Company() {
    }

    public Integer getCompany_number() {
        return company_number;
    }

    public void setCompany_number(Integer company_number) {
        this.company_number = company_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLogin_money() {
        return login_money;
    }

    public void setLogin_money(Integer login_money) {
        this.login_money = login_money;
    }

    public Integer getCompany_type() {
        return company_type;
    }

    public void setCompany_type(Integer company_type) {
        this.company_type = company_type;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company_number=" + company_number +
                ", name='" + name + '\'' +
                ", login_money=" + login_money +
                ", company_type=" + company_type +
                '}';
    }
}
