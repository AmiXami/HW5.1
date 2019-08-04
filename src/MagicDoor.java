public class MagicDoor {

    public Hero[] players(){
        Hero n1 = new Hero(500, 100, 1);
        Hero n2 = new Hero(400, 100, 2);
        Hero n3 = new Hero(600, 300, 3);

        Hero[] playersBundle = {n1,n2,n3};

        return playersBundle;

    }
}
