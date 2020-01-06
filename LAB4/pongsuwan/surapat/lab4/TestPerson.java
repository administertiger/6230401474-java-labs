package pongsuwan.surapat.lab4;

class TestPerson {
    public static void main(String[] args) {
        Person unknown = new Person();
        System.out.println(unknown);
        System.out.println(Person.getNumberOfPerson() + " person has been created.");
        Person sala = new Person("Sala");
        Person mane = new Person("Mane", 175, 65);
        System.out.println(sala);
        System.out.println(mane);
        Person handerson = new Person("Handerson", 180, 100);
        System.out.println(handerson);
        System.out.println(mane.getName() + " 's BMI is " + mane.getBMI());
        System.out.println(handerson.getName() + "'s BMI is " + handerson.getBMI());
        handerson.setWeight(80.0);
        System.out.println(handerson.getName() + "'s BMI is " + handerson.getBMI());
        System.out.println(Person.getNumberOfPerson() + " person has been created.");
    }
}