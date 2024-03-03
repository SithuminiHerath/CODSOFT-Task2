import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t*************************");
        System.out.println("\tStudent Grade Calculator!");
        System.out.println("\t*************************");
        System.out.print("\nEnter the number of subjects: ");
        int NoOfSubjects = scanner.nextInt();

        //  store marks in each subject
        int[] marks = new int[NoOfSubjects];

        // Input marks
        for (int i = 0; i < NoOfSubjects; i++) {
            System.out.print("Enter marks (out of 100) for Subject No" + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }


        // Calculate total marks
        int totalMarks = calculateTotalMarks(marks);

        // Calculate average percentage
        double averagePercentage = calculateAveragePercentage(totalMarks, NoOfSubjects);

        // Assign grades
        char grade = Grade(averagePercentage);

        // Display results
        display(totalMarks, averagePercentage, grade);

        scanner.close();
    }

    // calculate total marks
    private static int calculateTotalMarks(int[] marks)
    {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }


    // calculate average percentage
    private static double calculateAveragePercentage(int totalMarks, int numSubjects)
    {
        return (double) totalMarks / numSubjects;
    }


    // grades
    private static char Grade(double averagePercentage) {
        if (averagePercentage >= 80) {
            return 'A';
        } else if (averagePercentage >= 70) {
            return 'B';
        } else if (averagePercentage >= 50) {
            return 'C';
        } else if (averagePercentage >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }


    // Function to display results
    private static void display(int totalMarks, double averagePercentage, char grade)
    {
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: "+ averagePercentage);
        System.out.println("Grade: " + grade);
    }



}

