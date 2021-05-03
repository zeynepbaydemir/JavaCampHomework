public class UserManager {
    public void list(User user){
        System.out.println("Course listed."+user.getId());
    }

    public void add(User user){
        System.out.println("Course added.");
    }

    public void delete(User user){
        System.out.println("Course deleted.");
    }
}
