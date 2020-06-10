import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) throws IOException
    {
        System.out.println("Введите адрес файла, который нужно прочитать");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));


            ArrayList<Integer> nums = new ArrayList<Integer>();
            while (fileReader.ready()) {
                int num = Integer.parseInt(fileReader.readLine());
                if (num % 2 == 0) {
                    nums.add(num);
                }
            }

            Collections.sort(nums);
            for (int i : nums) {
                System.out.println(i);
            }
        }
        catch (Exception e){

            e.printStackTrace();
            System.out.println("Файл не найден");
        }

    }
}
