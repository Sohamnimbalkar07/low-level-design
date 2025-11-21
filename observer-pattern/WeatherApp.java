import observer.ForecastObserver;
import observer.Observer;
import subject.Subject;
import subject.WeatherData;

public class WeatherApp {

    public static void main(String[] args) {

      Subject sub = new WeatherData();
      Observer O = new ForecastObserver(sub);

      if(sub instanceof WeatherData) {
          ((WeatherData) sub).setMeasurements(17, 45, 56);
      }

    }
}