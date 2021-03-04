package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class polyExercise {

    public static void main(String[] args) {

        HumanCreator newHuman = new HumanCreator();
        Human newHuman2 = new HumanCreator();
        newHuman.weight("160");
        newHuman2.name("");


    }
}

class HumanCreator implements Human{


    public void greeting(){
        System.out.println("Hello!");
    }


    public void name(String name){
        System.out.println("My name is " + name + ".");
    }


    public void age(int age){
        System.out.println("I am " + age + " years young");
    }


    public void height(String height){
        System.out.println("I am " + height + " tall");
    }

    public void weight(String weight){
        System.out.println(weight);
    }

}

class Clone extends HumanCreator{

    //@Override
    public void greeting(){
        System.out.println("This has been changed");
    }
}

class Parent{
    Human attributes;
    String parentsName;
    int parentsAge;
    String parentsHeight;


    public Parent(Human attributes){
        this.attributes = attributes;
    }

    public void parentsGreet(){
        attributes.greeting();
        attributes.name(this.parentsName);
        attributes.age(this.parentsAge);
        attributes.height(this.parentsHeight);

    }

    public Human getAttributes() {
        return attributes;
    }

    public void setAttributes(Human attributes) {
        this.attributes = attributes;
    }

    public String getName() {
        return parentsName;
    }

    public void setName(String name) {
        this.parentsName = name;
    }

    public int getAge() {
        return parentsAge;
    }

    public void setAge(int age) {
        this.parentsAge = age;
    }

    public String getHeight() {
        return parentsHeight;
    }

    public void setHeight(String height) {
        this.parentsHeight = height;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "attributes=" + attributes +
                ", name='" + parentsName + '\'' +
                ", age=" + parentsAge +
                ", height='" + parentsHeight + '\'' +
                '}';
    }
}
/*

class Child extends Parent{
    String childsName;

    public Child(String parentsName, int parentsAge, String parentsHeight, String childsName){
        super(parentsName, parentsAge, parentsHeight);
    }
}
*/








