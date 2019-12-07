package listdemo;


public class Hero {
    private Integer heroNumber;
    private String name;
    private Integer level;
    private Double power;
    private String type;
    private String camp;

    public Hero(Integer heroNumber, String name, Integer level, Double power, String type, String camp) {
        this.heroNumber = heroNumber;
        this.name = name;
        this.level = level;
        this.power = power;
        this.type = type;
        this.camp = camp;
    }

    public Integer getHeroNumber() {
        return heroNumber;
    }

    public void setHeroNumber(Integer heroNumber) {
        this.heroNumber = heroNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCamp() {
        return camp;
    }

    public void setCamp(String camp) {
        this.camp = camp;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "heroNumber=" + heroNumber +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", power=" + power +
                ", type='" + type + '\'' +
                ", camp='" + camp + '\'' +
                '}'+"\n";
    }
}
