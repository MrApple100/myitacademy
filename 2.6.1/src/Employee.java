public class Employee extends Person {
    public String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
    @Override
    public Person({

    })

    @Override
    public String toString() {
        return "("+name+", "+age+", "+company+")";
    }
    @Override
    public String work(){
        return "Manager";
    }
}

class Dog extends Animal{
    public String company;


    @Override
    public String eat() {
        return "Bone";
    }

}
class MyClass implements Drawable{
    public boolean drawing;
    public void start(){

    }
    public void stop(){

    }
    public void draw(){

    }
}