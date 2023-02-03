package myapp;

public class Monster {

    //members
    String name;
    int health;

    //constructor
    public Monster(){


    //getters and setters
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    //methods
    public void hit(int damage){
        this.health -= damage;
    }

    public boolean isDead(){
        return this.health <= 0;
    }

    @Override
    public String toString(){
        
    }

}
