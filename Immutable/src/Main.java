public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student("Dmytro", 21, "va-71");
        Student secondStudent = new Student("Dmytro", 21, "va-71");
        Student thirdStudent = new Student("Dmytro", 21, "vv-71");

        if (firstStudent.hashCode() != secondStudent.hashCode()){
            System.out.println("Not equals");
        }else {
            if (firstStudent.equals(secondStudent)) {
                System.out.println("Equals");
            } else {
                System.out.println("Not equals");
            }
        }

        if (firstStudent.hashCode() != thirdStudent.hashCode()){
            System.out.println("Not equals");
        }else {
            if (firstStudent.equals(thirdStudent)) {
                System.out.println("Equals");
            } else {
                System.out.println("Not equals");
            }
        }

        System.out.println("=================================");
        System.out.println();

        Age age = new Age(18);
        String name = "Dmytro";
        ImmutableStudent student = new ImmutableStudent(name, age, "va-71");
        System.out.println(student);

        age.setAge(27);
        System.out.println(student);

        name = "Ivan";
        System.out.println(student);

        student.getAge().setAge(20);
        System.out.println(student);

        Age newAge =  new Age(25);
        student.setAge(newAge);
        System.out.println(student);

        newAge.setAge(26);
        System.out.println(student);

        student.setName("Ivan");
        System.out.println(student);

    }
}
