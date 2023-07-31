package Encapsulation_HW;

public class EmploeeClass {
    private String ID;
    private String name;
    private int salary;


    // Constructors
    public EmploeeClass(String ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    EmploeeClass() {

    }


    public String getID() {
        return ID;
    }


    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        try {
            checkSalary(salary);
            this.salary = salary;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public void checkSalary(int sal) throws Exception {
        if (sal < 0) {
            throw new Exception("sorry! you can't enter a negitive salary ! ");
        }
    }
    // methods

    public int getAnnulaSalary() {
        return salary * 12;
    }

    public int raisedSalary(int precent) {


        return salary = salary + (salary * precent / 100);
    }


    public String toString() {
        String str = "ID : " + ID + "\n name : " + name + "\n Salary : " + salary;

        return str;
    }
}
