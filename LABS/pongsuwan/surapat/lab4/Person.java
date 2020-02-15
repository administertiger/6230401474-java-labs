package pongsuwan.surapat.lab4;

/**
 * This program is to create a class "Person" and test the code.
 * 
 * Author: Surapat Pongsuwan
 * ID: 623040147-4
 * Section: 2
 * Date: January 9, 2020
 */

import java.text.DecimalFormat;

public class Person {
    private String name;
    private Double height;
    private Double weight;
    private static int numberOfPerson = 0;

    public Person()
    {
        this.name = "unknown";
        this.height = 0.0;
        this.weight = 0.0;
        numberOfPerson += 1;
    }

    public Person(String namePerson)
    {
        this.name = namePerson;
        this.height = 0.0;
        this.weight = 0.0;
        numberOfPerson += 1;
    }

    public Person(String namePerson, double heightPerson, double weightPerson)
    {
        this.name = namePerson;
        this.height = heightPerson;
        this.weight = weightPerson;
        numberOfPerson += 1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double newHeight) {
        this.height = newHeight;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double newWeight) {
        this.weight = newWeight;
    }

    DecimalFormat df = new DecimalFormat("#0.00");

    public String getBMI() {
        String BMI = df.format(this.weight / ((this.height / 100) * (this.height / 100)));
        return BMI;
    }

    public static int getNumberOfPerson() {
        return numberOfPerson;
    }
    @Override
    public String toString()
    {
        return "name=" + name + ", height=" + height + " cm. weight=" + weight + " kg." ;
    }

}



