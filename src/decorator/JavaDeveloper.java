package decorator;

public class JavaDeveloper extends Developer {

    public JavaDeveloper(Software software) {
        super(software);
    }
    @Override
    public String getDescription() {
        return "I'm a Java Dev";
    }

    @Override
    public String getPackage() {
        return "$1234";
    }
}
