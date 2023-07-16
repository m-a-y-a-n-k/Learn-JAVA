import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = sc.nextLine();
        System.out.println("Maximum marks in an exam");
        int maxMarks = sc.nextInt();
        String[] subjects = {"English", "Maths", "Science", "Hindi", "Social Studies"};
        int numOfSubjects = subjects.length;
        int totalMarks = 0;
        int totalMaxMarks = maxMarks * numOfSubjects;

        for(int sub = 0; sub < numOfSubjects; sub++){
            System.out.println("Enter marks in subject : " + subjects[sub]);
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double percentage = ((double)totalMarks / (double)totalMaxMarks) * 100;

        System.out.println("Dear , " + name);
        System.out.println("Your aggregate percentage is : " + percentage);
    }
}
