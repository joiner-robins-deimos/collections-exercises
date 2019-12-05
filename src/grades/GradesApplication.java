package grades;

public class GradesApplication {
    public static void main(String[] args) {
        Student jw = new Student("JW");
        jw.addGrade(0);
        jw.addGrade(100);
        jw.addGrade(50);
        jw.addGrade(25);
        jw.addGrade(75);
        System.out.println(jw.getName());
        System.out.println(jw.getGradeAverage());
    }
}
