import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"thanh", "nam", "son", "minh", "dang", "hung"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a student's name: ");
        String name = scanner.nextLine();
        boolean wasFound = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                wasFound = true;
                System.out.printf("%s was found at position %d", name, i + 1);
                break;
            }
        }
        if (!wasFound) {
            System.out.println(name + " was not found");

        }
    }
}
