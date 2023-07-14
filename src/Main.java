import jdk.jshell.PersistentSnippet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        List<String> stringOfPersons = FileReader.fileImport("person.txt");

        for (var actual : stringOfPersons) {
            String[] lineAsArray = actual.split(",");
            String name = lineAsArray[0];
            int age = Integer.parseInt(lineAsArray[1]);
            Gender gender = lineAsArray[2].equals("férfi") ? Gender.MALE : Gender.FEMALE;

            //Person newP = new Person(name, age, gender);
            Person newPP = new Person(lineAsArray[0],
                    Integer.parseInt(lineAsArray[1]),
                    /*Gender.valueOf(lineAsArray[2])*/
                    lineAsArray[2].equals("férfi") ? Gender.MALE : Gender.FEMALE);

            persons.add(newPP);
            /*persons.add(new Person(lineAsArray[0],
                    Integer.parseInt(lineAsArray[1]),
                    Gender.valueOf(lineAsArray[2])));*/
        }

        for (var actual : persons) {
            System.out.println(actual);
        }
    }
}
