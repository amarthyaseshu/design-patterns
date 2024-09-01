package decorator;

public abstract class Developer implements Software {

    protected Software software;

    public Developer(Software software) {
        this.software = software;
    }
}
