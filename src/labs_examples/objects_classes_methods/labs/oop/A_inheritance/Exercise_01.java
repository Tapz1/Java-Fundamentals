package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.util.ArrayList;

public class Exercise_01 {
    // controller class


    public static void main(String[] args) {
        String[] condiments = new String[]{"Ketchup", "A1 Sauce"};

        Meal myMeal = new Meal(true, "coke", 2, "sesame", condiments, "beef");


        System.out.println(myMeal.getBread() + " | " + myMeal.getMeat() + " | " + myMeal.getPatties() + " | \nDid you want fries with that: " + myMeal.isFries() + "\n Drink:  " + myMeal.getDrink());
    }

}


class Sandwich{
    protected String bread;
    protected String[] condiments;
    protected String meat;

    public Sandwich(String bread, String[] condiments, String meat) {
        this.bread = bread;
        this.condiments = condiments;
        this.meat = meat;

    }

    public void sandwichMessage(){
        System.out.println("Your sandwich has been served.");
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String[] getCondiments() {
        return condiments;
    }

    public void setCondiments(String[] condiments) {
        this.condiments = condiments;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", condiments=" + condiments +
                ", meat='" + meat + '\'' +
                '}';
    }
}

class Burger extends Sandwich{
    protected int patties;
    Burger(int patties, String bread, String[] condiments, String meat){
        super(bread, condiments, meat);
        this.patties = patties;
    }

    @Override
    public void sandwichMessage() {
        System.out.println("Your burger has been served.");
    }

    public void orderReadOff(){
        System.out.println("Your burger is as follows: ");
        toString();

    }

    public int getPatties() {
        return patties;
    }

    public void setPatties(int patties) {
        this.patties = patties;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "patties=" + patties +
                '}';
    }
}

class Meal extends Burger{
    protected boolean fries;
    protected String drink;

    Meal(boolean fries, String drink, int patties, String bread, String[] condiments, String meat){
        super(patties, bread, condiments, meat);
        this.fries = fries;
        this.drink = drink;
    }

    @Override
    public void sandwichMessage(){
        System.out.println("Your meal has been served.");
    }

    @Override
    public void orderReadOff(){
        System.out.println("Your whole meal is as follows:");
        toString();
    }

    @Override
    public String toString() {
        return "Meal{" +
                "fries=" + fries +
                ", drink='" + drink + '\'' +
                '}';
    }

    public boolean isFries() {
        return fries;
    }

    public void setFries(boolean fries) {
        this.fries = fries;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}