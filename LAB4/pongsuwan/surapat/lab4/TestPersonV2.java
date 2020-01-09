package pongsuwan.surapat.lab4;

/**
 * This program is to create a class "PersonV2" which extends from class "Person".
 * 
 * Author: Surapat Pongsuwan
 * ID: 623040147-4
 * Section: 2
 * Date: January 9, 2020
 */

public class TestPersonV2 { 
    public static void main(String[] args) {
        PersonV2 doraemon = new PersonV2("Doraemon", 100, 100, "2017-05-26");
        PersonV2 nobita = new PersonV2("Nobita", 120, 25, "2012-01-05");
        System.out.println(doraemon);
        System.out.println(nobita);
        doraemon.howOld();
        nobita.howOld();
        doraemon.compareAge(nobita);
        nobita.compareAge(doraemon);
        doraemon.isBirthday();
        nobita.isBirthday();
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
    }
}
