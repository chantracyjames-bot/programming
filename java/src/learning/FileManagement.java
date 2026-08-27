/* file management



*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagement {
    static void basicFiles(String[] args) {
        try{
            String argument = args[0];

            File file = new File(argument);

            System.out.printf("%s %b%n%s %b%n%s %b%n%s %s%n%s %s%n%s %d%n%s %b%n%s %b",
                "createNewFile:", file.createNewFile(),
                "canRead:", file.canRead(),
                "canWrite:", file.canWrite(),
                "getAbsolutePath:", file.getAbsolutePath(),
                "getName:", file.getName(),
                "length:", file.length(),
                "exists:", file.exists(),
                "delete:", file.delete()
            );

            String argument2 = args[1];
            File dir = new File("./yes");

            dir.mkdir();
            dir.delete();

            FileWriter writer = new FileWriter(args[0]);
            writer.write("idkman");
            writer.close();

        } catch (IOException e) {
            System.out.println("file error");
        }
    }

    static void ioStreamFiles(String[] args) {
        //String argument = args[0];

        try(FileInputStream input = new FileInputStream("../../../main.txt")) {
            int i;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("idkman");
        }
    }

    static void bufferedFiles(String[] args) {
        String argument = args[0];

        try (BufferedReader myReader = new BufferedReader(new FileReader(argument))) {
            String line;

            while((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("idkman");
        }
    }

    public static void main(String[] args) {
        bufferedFiles(args);
    }
}
