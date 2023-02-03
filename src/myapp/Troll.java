package myapp;

public class Troll extends Monster implements Hittable {
    public Troll() {
        setName("troll");
        setHealth(5);
    }

    @Override
    public String toString() {
        "Troll(name =%s, health = %d)"
    }
}