package myapp;

public class Tree implements Hittable {
    private int health;;
    private String name;

    public Tree(){
        this.health = 10;
        this.name = "tree";

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    
}
