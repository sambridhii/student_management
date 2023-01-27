package model;

public class Marks {
    String student_name;

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double getScience() {
        return science;
    }

    public void setScience(double science) {
        this.science = science;
    }

    public double getComputer() {
        return computer;
    }

    public void setComputer(double computer) {
        this.computer = computer;
    }

    double maths;
    double science;
    double computer;

    public Marks(String student_name, double maths, double science, double computer) {
        this.student_name = student_name;
        this.maths = maths;
        this.science = science;
        this.computer = computer;
    }

    public double TotalMarks(){
        double marks = (maths+science+computer)/300;
        double marks_per = marks*100;
        System.out.println("Total marks percentage of " + this.student_name+ "=  "+ marks_per);
        return marks;
    }


}
