package observer;

import subject.Subject;

public class ForecastObserver implements Observer, DisplayElement {

    private Subject sub;
    private float temperature;


    public ForecastObserver(Subject sub) {
        this.sub = sub;
        sub.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Updated Temperature is " + temperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
       this.temperature = temp;
       this.display();
    }
}
