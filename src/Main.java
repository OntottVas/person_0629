import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = FileReader.fileReadHandler("res/person.txt");
        List<Person> peoples = new ArrayList<>();
        for (var line: lines) {
            String[] linaAsArray = line.split(",");

            peoples.add(new Person(linaAsArray[0],
                    Integer.parseInt(linaAsArray[1]),
                    linaAsArray[2].equals("férfi") ? Gender.MALE : Gender.FEMALE));
        }

        for (var actual:peoples) {
            System.out.println(actual);
        }
    }

}
