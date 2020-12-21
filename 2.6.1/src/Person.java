public class Person {
    int age;
    String name;
    Person(String name,int age){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "("+name+", "+age+")";
    }
    public String work(){
        return "None";
    }
}
