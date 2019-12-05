package grades;

import java.util.HashMap;

import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student person = new Student("Guy");
        person.addGrade(0);
        person.addGrade(100);
        person.addGrade(50);

        Student person2 = new Student("Dude");
        person2.addGrade(0);
        person2.addGrade(100);
        person2.addGrade(50);

        Student person3 = new Student("Bro");
        person3.addGrade(0);
        person3.addGrade(100);
        person3.addGrade(50);

        Student person4 = new Student("Bruh");
        person4.addGrade(0);
        person4.addGrade(100);
        person4.addGrade(50);

        students.put("Github23", person);
        students.put("Github3", person2);
        students.put("Github2353", person3);
        students.put("Github299993", person4);

        Scanner sc = new Scanner(System.in);
        String input;

        while (true){

            System.out.println("Enter a command:\n1: See by Github username\n2: See all grades");
            input = (String) sc.nextLine();
            switch (input){
                case "1":{
                    for (HashMap.Entry<String, Student> item : students.entrySet()) {
                        System.out.println(item.getKey());
                    }
                    System.out.println("Enter a Github username...");
                    input = (String) sc.nextLine();
                    if (students.containsKey(input)){
                        System.out.println(students.get(input).getName());
                        System.out.println("Average: " + students.get(input).getGradeAverage());
                        students.get(input).getGrades();
                    } else {
                        System.out.println("error, user not found.");
                    }
                    break;
                }
                case "2": {
                    for (HashMap.Entry<String, Student> item : students.entrySet()) {
                        System.out.println(item.getKey());
                        System.out.println(item.getValue().getName());
                        item.getValue().getGrades();
                        System.out.println(item.getValue().getGradeAverage());
                        System.out.println("==========================");
                    }
                    break;
                }
                default: {
                    System.out.println("Error, unknown command.");
                    break;
                }
            }


            System.out.println("Continue? (Y / N)");
            input = (String) sc.nextLine();
            if (input.equalsIgnoreCase("y")){
                continue;
            }
            else {
                break;
            }
        }
    }
}
