import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }

            list.add(family);
            list.add(city);
        }
        String familyCity = reader.readLine();  // используем, если нужно работать с названиями городов
        for (int i = 0; i < list.size(); i += 2) { // перебираем в списке только города, "перешагивая" через фамилии
            if (list.get(i).equals(familyCity)) {
                System.out.println(list.get(i + 1)); //"спускаемся" вниз на одну позицию в списке с города на фамилию
            }
        }
        
        /*   Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());
        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }  */
    }
}

