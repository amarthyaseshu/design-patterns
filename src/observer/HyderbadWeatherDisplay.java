package observer;

public class HyderbadWeatherDisplay implements Observer{

    private float temp;
    private float humidity;

    @Override
    public void update(float temp, float humidity) {
        this.temp=temp;
        this.humidity=humidity;
    }

    public void display() {
        System.out.println("Current conditions in Hyderabad: " + temp + "C degrees and " + humidity + "% humidity");
    }
}
