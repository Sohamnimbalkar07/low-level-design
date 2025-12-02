package observer;

import subject.Subject;

public class CurrentHumidityObserver implements Observer, DisplayElement {

    private Subject sub;
    private float humidity;

    public CurrentHumidityObserver(Subject sub) {
        this.sub = sub;
        sub.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Updated Humidity is " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.display();
    }
}

