import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Write a program that copies the contents of a .jpg file to another using FileInputStream,
 * FileOutputStream, and byte[] buffer. Set the name of the new file as my-copied-picture.jpg.
 */
public class CopyImg {
    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream("my-pic.png");
        FileOutputStream fileWriter = new FileOutputStream("my-copied-picture.png");
        byte[] buffer = new byte[4096];

        int readBytes;
        while (!((readBytes = fileReader.read(buffer, 0, buffer.length)) <= 0)) {
            fileWriter.write(buffer, 0, readBytes);
        }
        fileReader.close();
        fileWriter.close();
    }
}
