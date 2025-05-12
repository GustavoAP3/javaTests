package Exercicios.E030;

public class Student {
    String name;
    double n1;
    double n2;
    double n3;
    public Student(String name, double n1, double n2, double n3){
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void passOrFail(){
        double finalGrade = n1 + n2 + n3;
        System.out.printf("\nFINAL GRADE = %.2f\n", finalGrade);
        if(finalGrade >= 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", 60 - finalGrade);
        }
    }
}
