package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student(String name){
        this.name = name;
//        grades.clear();
    }
    public String getName(){
        return this.name;
    };
    public void addGrade(int grade){
        grades.add(grade);
    };
    public double getGradeAverage(){
        double tot = 0;
        for (int item : this.grades){
            tot += (double) tot;
        }
        return tot / (double) this.grades.size();
    };

}
