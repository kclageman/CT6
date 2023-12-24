public class Student {

    private int rollNo;
    private String name;
    private String address;


    //default constructor
    Student() {
  
    }

    //parametrized constructor
    Student(int ROLLNO, String NAME, String ADDRESS) {
        
        this.rollNo = ROLLNO;
        this.name = NAME;
        this.address = ADDRESS;

    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int RollNo) {
        this.rollNo = RollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() { 
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String toString() {
        return "[ Roll No: " + rollNo + " Name: " + name + " Address: " + address + "]";
    }


}