package service;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started = false;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        this.started = true;
    }

    public void off() {
        this.started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if(started) {
            this.mileage += mileage;
        } else {
            System.out.println("Start the engine");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
