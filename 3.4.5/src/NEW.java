public class NEW {
}
class Teacher{

    public String name;
    private int phone;
    public String[] lessons;

    public int getPhone(){return 0;}
    public void setPhone(int phone){}
}

class Group{
    private String number;
    public Teacher classTeacher;
    public Student[] students;

    protected void getList(Student[] students){}
}
class Student{
    public String name;
    private int phone;

    public void setPhone(int phone){}
    public int getPhone(){return 0;}
}
