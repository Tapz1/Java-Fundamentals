package labs_examples.objects_classes_methods.labs.objects;

import java.util.Arrays;

class Controller{
    public static void main(String[] args) {
        User user1 = new User("Chris", 27, 2021);
        Interests user1Interests = new Interests("dogs", "step climbers");
        System.out.println("This is " + user1.name + " and he likes " + user1Interests.likes + " and dislikes " + user1Interests.dislikes);
    }

}


class User {
    String name;
    int age;
    int startYear;

    public User(String name, int age, int startYear){
        this.name = name;
        this.age = age;
        this.startYear = startYear;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", startYear=" + startYear +
                '}';
    }
}

class Interests{
    String likes;
    String dislikes;

    public Interests(String likes, String dislikes){
        this.likes = likes;
        this.dislikes = dislikes;
    }

    @Override
    public String toString() {
        return "Interests{" +
                "likes='" + likes + '\'' +
                ", dislikes='" + dislikes + '\'' +
                '}';
    }
}
