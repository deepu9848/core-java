package marksheet;

public class Student {
    private String name;
    private int age;
    private Gender gender;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Student(String name, int age, Gender gender){
        this. name = name;
        this. age = age;
        this. gender = gender;

    }
}
