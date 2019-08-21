import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> num = null;
        try {
            num = downloadNumbers("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("nie ma takiego pliku");
        }
        frequencyCount(num);

    }

    private static void frequencyCount(List<Integer> numbers) {
        TreeSet<Integer> frequencyNumbers = new TreeSet<>(numbers);
        for (Integer number : frequencyNumbers) {
            System.out.println(number + " Liczba wystąpień " + Collections.frequency(numbers, number));
        }
    }

    private static List<Integer> downloadNumbers(String usedFile) throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner input = new Scanner(file);
        List<Integer> fileNumbers = new ArrayList<>();

        while (input.hasNextInt()) {
            int fileNumber = input.nextInt();
            fileNumbers.add(fileNumber);
        }
        return fileNumbers;
    }


}
