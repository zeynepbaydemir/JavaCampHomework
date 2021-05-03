public class Instructor extends User{
    private String firstName;
    private String lastName;

    public Instructor() {}

    public Instructor (String firstName , String lastName,int id,String email) {
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
