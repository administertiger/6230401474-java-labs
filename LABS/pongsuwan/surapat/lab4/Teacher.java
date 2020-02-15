package pongsuwan.surapat.lab4;

/**
* This pogram is to create a class(Teacher) which extens from class "PersonV2"
* 
*Auther: Surapat Pongsuwan
*ID: 623040147-4
*Section: 2
*Date: January 9, 2020
*/

class Teacher extends PersonV2{
    private String teachingSubject;
    private int salary;

    public Teacher(String name, double height, double weight, 
    String str_dob, String teachingSubject, int salary) {
        super(name, height, weight, str_dob);
        this.teachingSubject = teachingSubject;
        this.salary = salary;
    } 
    // Get subject.
    public String getSubject() {
        return teachingSubject;
    }

    // Set a new subjects.
    public void setSubject(String subject) {
        this.teachingSubject = subject;
    }

    public double getSalary() {
        return this.salary;
    }

    // Set a new salary.
    public void setGPA(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        // "super.toString" is output from PersonV2.
        return super.toString() + ", teachingSubject=" + teachingSubject + ", salary=" + salary;
    }
}