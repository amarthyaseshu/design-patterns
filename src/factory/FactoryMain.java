package factory;

public class FactoryMain {

    public static void main(String[] args) {
        SaveWorldFactory saveWorld=new SaveWorldFactory();
        Avengers easyAvenger = saveWorld.getAvenger("easy");
        easyAvenger.fight();
    }
}
