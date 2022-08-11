package thirtyDaysOfCoding.day12_Inheritance;

import java.util.Scanner;

public class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}
    class Student extends Person {

    private int [] testScores;

        Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }

        public char calculate () {
            int score = 0;
            for (int i = 0; i < testScores.length; i++) {
            score += testScores[i];
            }
            score = score / testScores.length;
            if (score >= 90 && score <= 100){
                return 'O';
            }
            else if (score >= 80 && score < 90){
                return 'E';
            }
            else if (score >= 70 && score < 80){
                return 'A';
            }
            else if (score >= 55 && score < 70){
                return 'P';
            }
            else if (score >= 40 && score < 55){
                return 'D';
            }
            else return 'T';
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();
        int numScores = sc.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = sc.nextInt();
        }
        sc.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }

    }

