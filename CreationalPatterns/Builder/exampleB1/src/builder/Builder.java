package builder;

import enums.CarType;
import enums.Transmission;
import service.Engine;
import service.GpsNavigator;
import service.TripComputer;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGpsNavigation(GpsNavigator gpsNavigator);
}
