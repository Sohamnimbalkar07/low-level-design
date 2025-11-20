package observer;

import subject.Subject;

public class ForecastObserver implements Observer, DisplayElement {

    Subject wd;
    float temperature;

    public ForecastObserver() {
        wd.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Updated Temperature is" + temperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
       this.temperature = temp;
       display();
    }
}
