import java.util.Scanner;
import java.io.File;
import java.time.LocalTime;

public class Main {

    public static void printAnimal(String filepath) {
        File file = new File(filepath);
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String i = fileReader.nextLine();
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.print("file not found");
        }
    }

    public static void getTime() {
        
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What exhibit would you like to visit?"
        + "\n1 - Kangaroo\n" + "2 - Mouse\n" + "3 - meowmeowmeow\n" + "4 - Bald Eagle");
        int exhibit = scanner.nextInt();
        if (exhibit == 1) {
            printAnimal("src/kangaroo.txt");
        } else if (exhibit == 2) {
            printAnimal("src/mouse.txt");
        } else if (exhibit == 3) {
            printAnimal("src/meowmeowmeow.txt");
        } else if (exhibit == 4) {
            printAnimal("src/eagle.txt");
        }
    }
}