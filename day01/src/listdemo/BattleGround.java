package listdemo;

import java.util.List;

public class BattleGround {
    private Integer groundId;
    private String name;
    private List<Hero> redArmy;
    private List<Hero> blueAmry;

    public BattleGround(Integer groundId, String name, List<Hero> redArmy, List<Hero> blueAmry) {
        this.groundId = groundId;
        this.name = name;
        this.redArmy = redArmy;
        this.blueAmry = blueAmry;
    }

    public Integer getGroundId() {
        return groundId;
    }

    public void setGroundId(Integer groundId) {
        this.groundId = groundId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hero> getRedArmy() {
        return redArmy;
    }

    public void setRedArmy(List<Hero> redArmy) {
        this.redArmy = redArmy;
    }

    public List<Hero> getBlueAmry() {
        return blueAmry;
    }

    public void setBlueAmry(List<Hero> blueAmry) {
        this.blueAmry = blueAmry;
    }

    @Override
    public String toString() {
        return "BattleGround{" +
                "groundId=" + groundId +
                ", name='" + name + '\'' +
                ",\n redArmy=" + redArmy +
                ", blueAmry=" + blueAmry +
                '}';
    }
}
