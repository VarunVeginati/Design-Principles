package builder;

import enums.CarType;
import enums.Transmission;
import model.Car;
import service.Engine;
import service.GpsNavigator;
import service.TripComputer;

public class CarBuilder implements Builder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGpsNavigation(GpsNavigator gpsNavigation) {
        this.gpsNavigator = gpsNavigation;
    }

    public Car getResult() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
