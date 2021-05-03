public class Main {

    public static void main(String[] args) {

        Instructor instructor=new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setEmail("EnginDemi***@gmail.com");
        instructor.setId(1234);

        InstructorManager instructorManager= new InstructorManager();
        instructorManager.create(instructor);
        instructorManager.update(instructor);

        System.out.println("--------------------------------");

        Student student=new Student();
        student.setFirstName("Zeynep");
        student.setLastName("Baydemir");
        student.setEmail("ZeynepBay****@gmail.com");
        student.setId(4567);

        StudentManager studentManager = new StudentManager();
        studentManager.complete(student);

        System.out.println("--------------------------------");
    }
}
