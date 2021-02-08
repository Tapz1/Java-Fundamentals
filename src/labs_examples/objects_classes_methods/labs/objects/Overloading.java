package labs_examples.objects_classes_methods.labs.objects;

public class Overloading {

    public static void main(String[] args) {
        Phone myPhone = new Phone();
        Phone hisPhone = new Phone();


    }
}


class Phone{
    String make;
    String model;
    int memory;



    public Phone(){
        make = "iPhone";
        model = "11 Pro";
        memory = 256;
    }

    public Phone(String make, String model, int memory){
        this.make = make;
        this.model = model;
        this.memory = memory;
    }



    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }
}
