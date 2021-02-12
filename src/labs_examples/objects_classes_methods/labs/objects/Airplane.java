package labs_examples.objects_classes_methods.labs.objects;


import java.awt.*;

class PlaneMaker {

    public static void main(String[] args) {
        Engine myEngine = new Engine(500);
        Stereo myStereo = new Stereo("JBL");
        Fuel myFuel = new Fuel(650.5, 324.86);

        Airplane myPlane = new Airplane(myEngine, myStereo, myFuel, "red");

        System.out.println("My plane has a fuel capacity of " + myFuel.getCapacity() + ", but it's currently at " + myFuel.getCurrentLevel());

        System.out.println(myPlane.toString());

        Airplane yourAirplane = new Airplane(750, "alpine", 800, 720, "red");
        System.out.println(yourAirplane);
    }

}

class Airplane{
    Engine engine;
    Stereo stereo;
    Fuel fuel;
    String color;

    public Airplane(Engine engine, Stereo stereo, Fuel fuel, String color){
        this.engine = engine;
        this.stereo = stereo;
        this.fuel = fuel;
        this.color = color;
    }

    public Airplane(double horsePower, String brand, double capacity, double currentLevel, String color){
        this.engine = new Engine(horsePower);
        this.stereo = new Stereo(brand);
        this.fuel = new Fuel(capacity, currentLevel);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engine=" + engine +
                ", stereo=" + stereo +
                ", fuel=" + fuel +
                ", color='" + color + '\'' +
                '}';
    }
}

class Fuel{
    private double capacity;
    private double currentLevel;

    public Fuel(double capacity, double currentLevel){
        this.capacity = capacity;
        this.currentLevel = currentLevel;

    }

    @Override
    public String toString() {
        return "Fuel{" +
                "capacity=" + capacity +
                ", currentLevel=" + currentLevel +
                '}';
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setCurrentLevel(double currentLevel) {
        this.currentLevel = currentLevel;
    }

}





