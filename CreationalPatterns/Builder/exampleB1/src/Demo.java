import builder.CarBuilder;
import builder.CarManualBuilder;
import model.Car;
import model.Manual;

// Builder isn't that important. It's used, but spring takes care of it
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);

        Manual manual = carManualBuilder.getResult();
        System.out.println("\nCar Manual built:\n" + manual.print());
    }
}
