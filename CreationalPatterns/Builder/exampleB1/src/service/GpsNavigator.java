package service;

public class GpsNavigator {
    private String route;

    public GpsNavigator() {
        this.route = "New York";
    }

    public GpsNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return this.route;
    }
}
