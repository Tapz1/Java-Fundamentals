package labs_examples.objects_classes_methods.labs.objects;


import java.awt.*;

class PlaneMaker {

    public static void main(String[] args) {
        Engine myEngine = new Engine(500);
        Stereo myStereo = new Stereo("JBL");
        FuelCapacity myFuelCap = new FuelCapacity(650.5);
        CurrentFuelLevel myCurrentFuel = new CurrentFuelLevel(324.86);
        Airplane myPlane = new Airplane(myEngine, myStereo, myFuelCap, myCurrentFuel, "red");

        System.out.println("My plane has a fuel capacity of " + myPlane.capacity.capacity + ", but it's currently at " + myCurrentFuel.currentFuelLevel);

        System.out.println(myPlane.toString());
    }

}

class Airplane{
    Engine engine;
    Stereo stereo;
    FuelCapacity capacity;
    CurrentFuelLevel currentFuelLevel;
    String color;

    public Airplane(Engine engine, Stereo stereo, FuelCapacity capacity, CurrentFuelLevel currentFuelLevel, String color){
        this.engine = engine;
        this.stereo = stereo;
        this.capacity = capacity;
        this.currentFuelLevel = currentFuelLevel;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engine=" + engine +
                ", stereo=" + stereo +
                ", capacity=" + capacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", color='" + color + '\'' +
                '}';
    }
}

class FuelCapacity{
    double capacity;

    public FuelCapacity(double capacity){
        this.capacity = capacity;

    }

    @Override
    public String toString() {
        return "FuelCapacity{" +
                "capacity=" + capacity +
                '}';
    }
}

class CurrentFuelLevel{
    double currentFuelLevel;

    public CurrentFuelLevel(double currentFuelLevel){
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "CurrentFuelLevel{" +
                "currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}


