package inheritance;

public class TieFighter extends Spacecraft {

    //as opposed to x-wings, tie fighters don't have shields and therefore it doesn't make sense
    //to have a shieldStrength attribute in this class
    private String mainArmament;

    //constructor uses the superclass attributes "name, "type, and "tonnage" and adds its own as well
    public TieFighter(String name, String type, int tonnage, String mainArmament) {
        super(name, type, tonnage);
        this.mainArmament = mainArmament;
    }

}
