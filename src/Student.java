public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        if(age>0){
            this.age = age;
        }else{
            throw new MyException("Age false");
        }
    }

    public Student() {
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
        if(age>0){
            this.age = age;
        }else{
            throw new MyException("Age false");
        }

    }

    @Override
    public String toString() {
        return "\nStudent" +
                " name: " + name + '\'' +
                " age: " + age ;
    }
}
