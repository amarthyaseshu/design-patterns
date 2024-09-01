package decorator;

public class Cloud implements Software{
    @Override
    public String getDescription() {
        return "I'm a Cloud Dev";
    }

    @Override
    public String getPackage() {
        return "$1200";
    }
}
