import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class TextProduction
{
    public static void main(String[] args)
    {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!" + new Date());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
