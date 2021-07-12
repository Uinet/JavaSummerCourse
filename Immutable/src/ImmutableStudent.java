public final class ImmutableStudent {
    private final String name;
    private final Age age;
    private final String group;

    public ImmutableStudent(String name, Age age, String group){
        this.name = name;
        this.group = group;
        this.age = new Age(age.getValue());
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return new Age(age.getValue());
    }

    public String getGroup() {
        return group;
    }

    public ImmutableStudent setName(String name){
        return new ImmutableStudent(name, new Age(age.getValue()), group);
    }

    public ImmutableStudent setGroup(String group){
        return new ImmutableStudent(name, new Age(age.getValue()), group);
    }

    public ImmutableStudent setAge(Age age){
        return new ImmutableStudent(name, new Age(age.getValue()), group);
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}
