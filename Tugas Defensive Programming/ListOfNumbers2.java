import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {
    private Vector<Integer> victor;
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector<>(size);
        for (int i = 0; i < size; i++)
            victor.addElement(i);

        try {
            this.readList("infile.txt");
            this.writeList();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }
    }

    public void readList(String fileName) throws FileNotFoundException, IOException {
        String line = null;
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            while ((line = raf.readLine()) != null) {
                Integer i = Integer.parseInt(line);
                System.out.println(i);
                victor.addElement(i);
            }
        } catch (NumberFormatException e) {
            System.err.println("Error parsing integer: " + e.getMessage());
        }
    }

    public void writeList() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("outfile.txt"))) {
            for (Integer i : victor) {
                writer.write(i.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}
