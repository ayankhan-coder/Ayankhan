/* THIS & SUPER keyWord in Java */

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Student extends Person {
    String course;

    Student(String name) {
        super(name);
        this.course = "Not Assigned";
    }
    Student(String name, String course) {
        super(name);
        this.course = course;
    }
    public String getCourse() {
        return course;
    }
}

class This_Super_keyWord{
    public static void main(String[] args) {
        Student student = new Student("Ayan");
        Student s = new Student("Ayan","java");

        System.out.println(student.getName());
        System.out.println(student.getCourse());

        System.out.println(s.getName());
        System.out.println(s.getCourse());







    }
}