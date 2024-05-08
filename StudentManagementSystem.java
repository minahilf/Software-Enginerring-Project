import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Generate a random student ID
            int randomNumber = 10000 + (int) (Math.random() * 90000);

            System.out.print("Enter Student Name: ");
            String nameOfStudent = sc.nextLine();

            System.out.println("Select Your Desired Course:");
            String[] courses = {"Graphic Designing - $4000", "Web Development - $5000", "Data Science - $7000", "Artificial Intelligence - $10000", "Freelancing - $6000"};
            for (String course : courses) {
                System.out.println(course);
            }
            System.out.print("Enter your desired course: ");
            String selectedCourse = sc.nextLine();

            int courseFee = getCourseFee(selectedCourse);

            System.out.print("Enter your current balance: ");
            double userBalance = sc.nextDouble();

            if (userBalance < courseFee) {
                System.out.println("Insufficient balance.");
            } else {
                double remainingBalance = userBalance - courseFee;
                System.out.println("Payment Successful in " + selectedCourse + ". Remaining balance: " + remainingBalance);
            }

            // Display student's status
            showStatus(nameOfStudent, randomNumber, selectedCourse, courseFee);
        }
    }

    public static int getCourseFee(String selectedCourse) {
        switch (selectedCourse) {
            case "Graphic Designing - $4000":
                return 4000;
            case "Web Development - $5000":
                return 5000;
            case "Data Science - $7000":
                return 7000;
            case "Artificial Intelligence - $10000":
                return 10000;
            case "Freelancing - $6000":
                return 6000;
            default:
                return 0;
        }
    }

    public static void showStatus(String nameOfStudent, int studentID, String enrolledCourse, int feesPaid) {
        System.out.println("Name of Student: " + nameOfStudent);
        System.out.println("Student ID: " + studentID);
        System.out.println("Enrolled Course: " + enrolledCourse);
        System.out.println("Fees Paid: " + feesPaid);
    }
}
