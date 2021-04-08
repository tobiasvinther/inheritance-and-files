package inheritance;

public abstract class Spacecraft {

    //Write a program that exemplifies the concept of inheritance.
    //Comment the program accordingly to describe your example.

    //attributes that all spacecrafts will have
    private String name;
    private String type;
    private int tonnage;

    //constructor, which subclasses will use as a base
    public Spacecraft(String name, String type, int tonnage) {
        this.name = name;
        this.type = type;
        this.tonnage = tonnage;
    }

}
