package pongsuwan.surapat.lab4;

/**
* This pogram is to create a class(Student) which extens from class "PersonV2"
* 
*Auther: Surapat Pongsuwan
*ID: 623040147-4
*Section: 2
*Date: January 9, 2020
*/

class Student extends PersonV2{
    private String major;
    private double GPA;

    Student(String name, double height, double weight, String str_dob, String major, double GPA) {
        // initialize the first 4 variable (PersonV2's variable).
        super(name, height, weight, str_dob);
        this.major = major;
        this.GPA = GPA;
    }

    // Get the major.
    public String getMajor() {
        return major;
    }

    // Set the major.
    public void setMajor(String major) {
        this.major = major;
    }

    // Get the GPA.
    public double getGPA() {
        return this.GPA;
    }

    // Set the GPA.
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        // "super.toString" is output from PersonV2.
        return super.toString() + ", major=" + major + ", GPA=" + GPA;
    }

}