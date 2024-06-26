import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        // Initialize variables
        double totalGrades = 0;
        double averageOfGrades;
        Scanner input = new Scanner(System.in);

        // Get the number of students
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("Number of students must be positive.");
        }

        // Create an array to store student grades
        int studentGrades[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter grades of Student " + (i + 1) + ":");
            studentGrades[i] = input.nextInt();
            if (studentGrades[i] > 100 || studentGrades[i] < 0) {
                throw new IllegalArgumentException("Grades must be between 0 and 100.");
            }
        }

        // Calculate total grades
        for (int i = 0; i < n; i++) {
            totalGrades += studentGrades[i];
        }

        // Calculate average grade
        averageOfGrades = totalGrades / n;

        // Find maximum and minimum grades
        double maxGrade = studentGrades[0];
        double minGrade = studentGrades[0];
        for (int i = 0; i < n; i++) {
            if (maxGrade < studentGrades[i]) {
                maxGrade = studentGrades[i];
            }
            if (minGrade > studentGrades[i]) {
                minGrade = studentGrades[i];
            }
        }

        // Calculate percentage of students who passed
        float totalPassedStudents = 0;
        for (int i = 0; i < n; i++) {
            if (studentGrades[i] >= 40) {
                totalPassedStudents++;
            }
        }
        float percentageOfStudentsPassed = (totalPassedStudents * 100) / n;

        // Display results
        System.out.println("Average grade: " + averageOfGrades);
        System.out.println("Maximum Grade: " + maxGrade);
        System.out.println("Minimum Grade: " + minGrade);
        System.out.println("Percentage of students passed: " + percentageOfStudentsPassed + "%");
    }
}


	