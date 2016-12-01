/**
 * Created by robertcampos on 11/29/16.
 */
public class Gameboard {
    private String railroadProperty;
    private String utilityProperty;
    CommChestChance[] chanceCards = new CommChestChance[50];
    private int noOfRailroads = 4;
    private int noOfUtilities = 2;

    public String railroadProperty() {
        return this.railroadProperty;
    }

    public String utilityProperty() {
        return this.utilityProperty;
    }

}
