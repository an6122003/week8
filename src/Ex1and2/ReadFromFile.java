package Ex1and2;

import javax.naming.Name;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String line, name, address;
        int age;
        int count = 0;
        double sum = 0;

        Scanner fileScanner = new Scanner(new File("src/Ex1and2/user.txt"));

        while (fileScanner.hasNext()){
            count +=1;
            line = fileScanner.nextLine();

            StringTokenizer reader = new StringTokenizer(line,",");
            if (reader.countTokens()!=3){
                throw new IOException("Invalid input format");
            }else {
                name =reader.nextToken();
                address = reader.nextToken();
                age = Integer.parseInt(reader.nextToken());
                sum += age;
            }

            System.out.printf("Name: %s, Address: %s, Age: %d\n",name,address,age);
        }

        System.out.println("Avarage age: "+ sum/count);

    }
}
