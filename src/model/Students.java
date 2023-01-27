package model;

public class Students {
    String name;
    int age;
    int roll_no;

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

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }



    public Students(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }
public void printFormat(){
    System.out.println("Name        Roll no.       Age");
    System.out.println(this.name+ "             " +this.roll_no  +  "           " +   this.age  );
}

}
