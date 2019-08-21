import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Integer> num = new ArrayList<>();
        num = downloadNumbers("text.txt");
        frequencyCount (num);

        }

    private static void frequencyCount(List<Integer> numbers) {
        TreeSet<Integer> frequencyNumbers = new TreeSet<>(numbers);
        for (Integer number : frequencyNumbers) {
            System.out.println(number + " Liczba wystąpień " + Collections.frequency(numbers,number));
        }
    }

    private static List<Integer> downloadNumbers(String s) throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner input = new Scanner(file);
        List<Integer> fileNumbers = new ArrayList<>();

        while (input.hasNextInt()){
            int fileNumber = input.nextInt();
            fileNumbers.add(fileNumber);

    }
        return fileNumbers;
    }


}
