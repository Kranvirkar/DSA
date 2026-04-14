import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Stream;

public class SearchWordInJson {

    public static void main(String[] args) {

        String folderPath = "C:\\Users\\Akshronix 001\\Downloads\\test";
        String searchWord = "age";

        try (Stream<Path> paths = Files.walk(Paths.get(folderPath))) {

            paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".json"))
                    .forEach(path -> {

                        try {
                            List<String> lines = Files.readAllLines(path);

                            for (String line : lines) {
                                if (line.toLowerCase().contains(searchWord.toLowerCase())) {
                                    System.out.println("\nFound in file: " + path.getFileName());
                                    System.out.println("Line: " + line.trim());
                                }
                            }

                        } catch (IOException e) {
                            System.out.println("Error reading file: " + path);
                        }
                    });

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}