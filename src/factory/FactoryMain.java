package factory;

public class FactoryMain {



    public static void main(String[] args) {
        SaveWorld saveWorld=new SaveWorld();
        Avengers easyAvenger = saveWorld.getAvenger("easy");
        easyAvenger.fight();
    }
}
