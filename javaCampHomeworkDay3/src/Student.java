public class Student extends User{
    private String firstName;
    private String lastName;

    public Student() {}

    public Student (String firstName , String lastName,String email,int id) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.setId(id);
        this.setEmail(email);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
