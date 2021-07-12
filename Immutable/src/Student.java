import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group){
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() == this.getClass()){
            Student student = (Student) o;
            return age == student.age && Objects.equals(name, student.name) && Objects.equals(group, student.group);
        }else return false;
    }

    @Override
    public int hashCode() {
        return (age * 31 + name.hashCode()) * 31 + group.hashCode();
    }
}
