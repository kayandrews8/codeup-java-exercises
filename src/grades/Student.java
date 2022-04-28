package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for (Integer grade : grades){
            total += grade;
        }
        return total/grades.size();
    }

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public static void main(String[] args) {
        Student james = new Student("James");
        james.addGrade(95);
        james.addGrade(83);
        james.addGrade(79);
        System.out.println(james.getGradeAverage());
    }


}
