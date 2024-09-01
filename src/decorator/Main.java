package decorator;

public class Main {

    public static void main(String[] args) {
        Software software=new Cloud();
        System.out.println(software.getDescription() + " $" + software.getPackage());
        software=new JavaDeveloper(software);
        System.out.println(software.getDescription() + " $" + software.getPackage());
        software=new PythonDeveloper(software);
        System.out.println(software.getDescription() + " $" + software.getPackage());
    }
}
