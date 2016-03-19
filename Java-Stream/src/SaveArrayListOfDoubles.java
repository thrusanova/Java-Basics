import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Write a program that saves and loads the information from an ArrayList to a file using ObjectInputStream,
 * ObjectOutputStream. Set the name of the new file as doubles.list
 */
public class SaveArrayListOfDoubles  {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        List<Double> list = Arrays.asList(3.7, 5.8, 6.4, 1.3, 0.8);
        try (
                ObjectOutputStream fileWriter = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("doubles.list")))
        ) {
            fileWriter.writeObject(list);
        }
        try (
                ObjectInputStream fileReader = new ObjectInputStream(new BufferedInputStream(new FileInputStream("doubles.list")))
        ) {
            String fileRead = fileReader.readObject().toString();
            System.out.println(fileRead);
        }
    }

}