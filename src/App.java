import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        File f1 = new File("src/input.txt");
        String[] words = null; 
        int wc = 0;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;


        while ((s = br.readLine()) != null) {
            words = s.split(" ");
            wc = wc + words.length;
        }
        fr.close();

        FileWriter fileWriter;

        try {
            fileWriter = new FileWriter( "src/output.txt");
            fileWriter.write(wc + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Encounterd an IOException.");
            e.printStackTrace();
        }
        System.out.println("Number of words in the file: " + wc);
    }
}
