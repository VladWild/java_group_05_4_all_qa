import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String file = null;

        try {
            file = Files.readString(Path.of("qa-2022-04-19/src/main/resources/file.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file);

        String[] split = file.split(System.lineSeparator());

        System.out.println(Arrays.toString(split));
        System.out.println(split.length);

        for (String line : split) {
            System.out.println(Arrays.toString(line.split(";")));
        }

        /*ReportService reportService = new ReportService();

        PringService pringService = new PringService();
        pringService.printMenu();

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();


        switch (s) {
            case "1":
                //do something
                reportService.readFile();
                break;
            case "2":
                //do something

                break;
            default:
                System.out.println("не понял команду");
        }

        scanner.close();*/
    }
}
