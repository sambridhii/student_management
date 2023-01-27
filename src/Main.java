import model.Classes;
import model.Marks;
import model.Students;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Students student1 = new Students("Diya",16,12);
        Students student2 = new Students("Siya",17,13);
        Students student3 = new Students("Miya",15,14);
        Marks student_1 = new Marks("Diya",50,60,70);
        Marks student_2 = new Marks("Siya",60,50,80);
        Marks student_3 = new Marks("Miya",70,80,60);
        Classes first= new Classes(12,"Diya",12);
        Classes second= new Classes(12,"Siya",13);
        Classes third= new Classes(12,"Miya",14);

        student_1.TotalMarks();
        student_2.TotalMarks();
        student_3.TotalMarks();
        student1.printFormat();
        student2.printFormat();
        student3.printFormat();

    }
}