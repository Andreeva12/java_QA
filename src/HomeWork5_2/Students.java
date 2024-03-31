package HomeWork5_2;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int sum = 0;
        int studentCount = 0;

        while (studentCount < numberOfStudents) {
            System.out.println("Enter grade for student " + (studentCount + 1) + ": ");
            int grade = sc.nextInt();
            sum += grade;
            studentCount++;
        }

        double averageGrade = (double) sum / numberOfStudents;
        System.out.println("Average grade in the group: " + averageGrade);
    }
}
