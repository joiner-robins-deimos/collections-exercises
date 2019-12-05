package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    };
    public void addGrade(int grade){
        grades.add(grade);
    };
    public void getGrades(){
        for (Integer grade : this.grades){
            System.out.println(grade);
        }
    }
    public double getGradeAverage(){
        double tot = 0;
        for (int item : this.grades){
            tot += (double) item;
        }
        return tot / (double) this.grades.size();
    };

}
