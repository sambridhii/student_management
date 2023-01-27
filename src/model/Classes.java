package model;

public class Classes {

    int grade;
    String st_name;
    int st_roll;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public int getSt_roll() {
        return st_roll;
    }

    public void setSt_roll(int st_roll) {
        this.st_roll = st_roll;
    }



    public Classes(int grade, String st_name, int st_roll) {
        this.grade = grade;
        this.st_name = st_name;
        this.st_roll = st_roll;
    }


}
