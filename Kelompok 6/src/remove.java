import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class remove {
    private List<Integer> data;

    public remove() {
        data = new ArrayList<>();
    }

    public void addData(int value) {
        data.add(value);
    }

    public void removeData(int index) {
        if (index >= 0 && index < data.size()) {
            data.remove(index);
            System.out.println("Data at index " + index + " has been removed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayData() {
        if (data.isEmpty()) {
            System.out.println("No data available.");
        } else {
            System.out.println("Data:");
            for (int value : data) {
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        remove remove = new remove();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Add data");
            System.out.println("2. Remove data");
            System.out.println("3. Display data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to add: ");
                    int value = scanner.nextInt();
                    remove.addData(value);
                    break;

                case 2:
                    System.out.print("Enter the index to remove: ");
                    int index = scanner.nextInt();
                    remove.removeData(index);
                    break;

                case 3:
                    remove.displayData();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
        } while (choice != 4);

        scanner.close();
    }
}
