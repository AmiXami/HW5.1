import java.util.Random;

public class Boss {
    private int hp;
    private int damage;
    public static int attributes ;

    public Boss(){
    }
    public static void changeBossAttributes(){
        Random r = new Random();
        int randomAttributes = r.nextInt(4) + 1;
        attributes = randomAttributes;

    }

    public static int getAttributes() {
        return attributes;
    }

    public static void setAttributes(int attributes) {
        Boss.attributes = attributes;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
