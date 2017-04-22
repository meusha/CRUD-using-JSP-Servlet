package Module;

/**
 * Created by user on 4/10/2017.
 */
public class Student {
    private int studentId;
    private String name;
    private String address;
    private String email;
    private String button;

    public Student(){

    }

    public Student(int studentId, String name, String address, String email){
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String toString() {
        return "Student [studentId=" + studentId + ", Name=" + name
                + ", Address=" + address + ", email=" + email + "]";
    }
}
