import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.util.Calendar;

public class Main {

    public static double getTemp()
    {
        Random rand = new Random();
        return rand.nextDouble(100 - 50 + 1) + 50;
    }

    public static String getTime()
    {
        Calendar calendar = Calendar.getInstance(); //Create calender object

        calendar.getTime();
        String placeholder = "";
        int minutes = calendar.get(Calendar.MINUTE);
        if (minutes < 10) {
            placeholder = "0";
        }
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        if (hours > 12) {
            hours = hours - 12;
        }
        return(hours+":"+placeholder+minutes);
    }

    public static void printInfo(String animal) {
        if (animal.equals("Kangaroo")) {
            System.out.println("Current animal: " + animal);
            System.out.println("Current time: " + getTime());
            System.out.printf("Habitat temperature: %.2fF %n", getTemp());
        } else if (animal.equals("Mouse")) {
            System.out.println("Current animal: " + animal);
            System.out.println("Current time: " + getTime());
            System.out.printf("Habitat temperature: %.2fF %n", getTemp());
        } else if (animal.equals("Cat")) {
            System.out.println("Current animal: " + animal);
            System.out.println("Current time: " + getTime());
            System.out.printf("Habitat temperature: %.2fF %n", getTemp());
        } else {
            System.out.println("Current animal: " + animal);
            System.out.println("Current time: " + getTime());
            System.out.printf("Habitat temperature: %.2fF %n", getTemp());
        }
    }

    public static void printAnimal(String filepath) {
        File file = new File(filepath);
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String i = fileReader.nextLine();
                System.out.println(i);
            }
        }
        catch (Exception e) {
            System.out.print("file not found");
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean selection = true;
        System.out.println("Welcome to the online zoo! We have like 4 animals here so have fun!");
        while (selection) {
            System.out.println("\n3Please enter a number for the animal you want to view\n" +
                    "1 - Kangaroo\n" +
                    "2 - Mouse\n" +
                    "3 - meowmeowmeow\n" +
                    "4 - Bald Eagle\n" +
                    "Enter -1 to exit the program");
            try {
                int cam = scanner.nextInt();
                switch (cam) {
                    case -1:
                        selection = false;
                        break;
                    case 1:
                        printAnimal("src/kangaroo.txt");
                        printInfo("Kangaroo");
                        break;
                    case 2:
                        printAnimal("src/mouse.txt");
                        printInfo("Mouse");
                        break;
                    case 3:
                        printAnimal("src/meowmeowmeow.txt");
                        printInfo("Cat");
                        break;
                    case 4:
                        printAnimal("src/eagle.txt");
                        printInfo("Eagle");
                        break;
                    default:
                        System.out.println("Can't find the camera, sorry!");
                }
            } catch (Exception e) {
                System.out.println("Camera not registered");
                scanner.next();
            }
        }
    }
}