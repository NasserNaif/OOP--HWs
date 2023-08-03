package week2__Project;

public class Car {
    private String code;
    private Route fixRoute;
    private int maxCapacity;


    public Car(String code, Route fixRoute, int maxCapacity) {
        this.code = code;
        this.fixRoute = fixRoute;
        this.maxCapacity = maxCapacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getfixRoute() {
        return fixRoute;
    }


    public void setfixRoute(Route fixRoute) {
        this.fixRoute = fixRoute;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


}
