package pongsuwan.surapat.lab4;

/**
 * This program is to create a class "PersonV2" which extends from class "Person".
 * 
 * Author: Surapat Pongsuwan
 * ID: 623040147-4
 * Section: 2
 * Date: January 9, 2020
 */

import java.time.LocalDate;

public class PersonV2 extends Person {
    private LocalDate dob;

    //Constructo with 4 parameters.
    public PersonV2(String name, double height, double weight, String str_dob) {
        //initilize the first 3 variables (Person's vaiables).
        super(name, height, weight);

        //initailize a new variable (Personv2's variable).
        this.dob = LocalDate.parse(str_dob);
    }
    
    // Setting person's Birthdate. 
    public void setDOB(String dob) {
        this.dob = LocalDate.parse(dob);
    }

    public LocalDate getDob() {
        return dob;
    } 

    // Check if today is the birthday of this object.
    public void isBirthday() {
        // The present date.
        LocalDate today = LocalDate.now();

        int birthDay = dob.getDayOfMonth(); // Person birthDay.
        int birthMonth = dob.getMonthValue(); // Person birthMonth.
        int nowDay = today.getDayOfMonth(); // The present day.
        int nowMonth = today.getMonthValue(); // The present month.

        if (birthDay == nowDay && birthMonth == nowMonth) {
            System.out.println("Today is " + getName() + "'s Birthday.");
        }
        else {
            System.out.println("Today is NOT " + getName() + "'s Birthday.");
        }
    }
    // Calculate age of the person by (year-months-day).
    public void howOld() {
        LocalDate today = LocalDate.now();

        int birthDay = dob.getDayOfMonth();
        int birthMonth = dob.getMonthValue();
        int birthYear = dob.getYear();
        int nowDay = today.getDayOfMonth();
        int nowMonth = today.getMonthValue();
        int nowYear = today.getYear();

        //  Age of a person.
        int yearOld = Math.abs(nowYear - birthYear);
        int monthOld = Math.abs(nowMonth - birthMonth);
        int dayOld = Math.abs(nowDay - birthDay);

        System.out.println(getName() + " is " + yearOld + " years " 
        + monthOld + " months and " + dayOld + " days" + " old.");
    }

    public void compareAge(PersonV2 another) {
        LocalDate BirthDayPerson1 = this.dob;
        LocalDate BirthDayPerson2 = another.dob;

        // Person1 BirthDay.
        int birthDay1 = dob.getDayOfMonth();
        int birthMonth1 = dob.getMonthValue();
        int birthYear1 = dob.getYear();

        // Person2 BirthDay.
        int birthDay2 = another.dob.getDayOfMonth();
        int birthMonth2 = another.dob.getMonthValue();
        int birthYear2 = another.dob.getYear();

        // The difference from BirthDay1 to BirthDay2.
        int diffDay = birthDay1 - birthDay2;
        int diffMonth = birthMonth1 - birthMonth2;
        int diffYear = birthYear1 - birthYear2;

        int compair = BirthDayPerson1.compareTo(BirthDayPerson2);

        // Person1's younger than Person2.
        if (compair > 1) {
            System.out.println(another.getName() + " is " +  diffYear + " years " 
            + diffMonth + " months " + diffDay + " days older than " + this.getName());
        }
        // Person1's older than Person2.
        else {
            System.out.println(this.getName() + " is " +  (-diffYear) + " years " 
            + (-diffMonth) + " months " + (-diffDay) + " days older than " + another.getName());
        }
    }

    @Override
    public String toString()
    {
        return "name=" + getName() + ", height=" 
        + getHeight() + " cm. weight=" + getWeight() + " kg., Birthday=" + dob ;
    }
}





