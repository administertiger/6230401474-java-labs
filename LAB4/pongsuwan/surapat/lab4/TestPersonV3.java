package pongsuwan.surapat.lab4;

/**
* This pogram is to create 2 classes(Student and Teacher) which extens from class "PersonV2"
* 
*Auther: Surapat Pongsuwan
*ID: 623040147-4
*Section: 2
*Date: January 9, 2020
*/

public class TestPersonV3 {
    public static void main(String[] args) {
        Teacher onizuka = new Teacher("Onizuka", 185, 80, "1998-07-07", "social study", 15000);
        Student zuckerberg = new Student("Zucherburg", 180, 25, "1984-05-14", "Computer Engineering", 4.0);
        System.out.println(onizuka);
        System.out.println(zuckerberg);
        onizuka.howOld();
        zuckerberg.howOld();
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
        PersonV2 micky = new PersonV2("Micky Mouse", 60, 25, "1982-01-01");
        System.out.println(micky);
        micky = new Student("Micky Mouse", 60, 25, "1982-01-01", "Animation", 3.0);
        System.out.println(micky);
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
        micky.compareAge(onizuka);
    }
}