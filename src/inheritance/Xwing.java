package inheritance;

public class Xwing extends Spacecraft {

    //this class inherits from Spacecrafts, but also have the following attributes:
    private int shieldStrength;
    private String mainArmament;

    //constructor uses the superclass attributes "name, "type, and "tonnage" and adds its own as well
    public Xwing(String name, String type, int tonnage, int shieldStrength, String mainArmament) {
        super(name, type, tonnage);
        this.shieldStrength = shieldStrength;
        this.mainArmament = mainArmament;
    }
}
