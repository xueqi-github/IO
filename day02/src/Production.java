import java.util.Date;

public class Production {
    private Integer prod_id;
    private String name;
    private Integer sale;
    private String prod_type;
    private Integer duty_personId;

    public Production(Integer prod_id, String name, Integer sale, String prod_type) {
        this.prod_id = prod_id;
        this.name = name;
        this.sale = sale;
        this.prod_type = prod_type;
    }

    public Production() {
    }

    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public String getProd_type() {
        return prod_type;
    }

    public void setProd_type(String prod_type) {
        this.prod_type = prod_type;
    }

    public Integer getDuty_personId() {
        return duty_personId;
    }

    public void setDuty_personId(Integer duty_personId) {
        this.duty_personId = duty_personId;
    }

    @Override
    public String toString() {
        return "Production{" +
                "prod_id=" + prod_id +
                ", name='" + name + '\'' +
                ", sale=" + sale +
                ", prod_type='" + prod_type + '\'' +
                '}';
    }
}
