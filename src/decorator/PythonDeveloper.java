package decorator;

public class PythonDeveloper extends Developer{

    public PythonDeveloper(Software software) {
        super(software);
    }
    @Override
    public String getDescription() {
        return "I'm a Python Dev";
    }

    @Override
    public String getPackage() {
        return "$4321";
    }
}
