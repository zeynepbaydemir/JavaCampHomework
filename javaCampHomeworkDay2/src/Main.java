public class Main {

    public static void main(String[] args) {

        Category category1 = new Category();
        category1.id=1;
        category1.name="My Courses";

        Category category2 = new Category();
        category2.id=2;
        category2.name="All Courses";

        Category[] categories = {category1,category2};


        for(Category category : categories) {
            System.out.println(category.name);
        }

        CategoryManager categoryManager = new CategoryManager();
        categoryManager.selectCategory(category1);
        categoryManager.selectCategory(category2);



        Course course1 = new Course();
        course1.id=1;
        course1.name="JAVA + REACT";
        course1.detail="by Engin Demirog";

        Course course2 = new Course();
        course2.id=2;
        course2.name="C# + ANGULAR";
        course2.detail="by Engin Demirog";

        Course[] courses = {course1,course2};

        for(Course course : courses) {
            System.out.println(course.name);
        }




        CourseManager courseManager = new CourseManager();
        courseManager.addToCart(course1);
        courseManager.addToCart(course2);


    }
}
