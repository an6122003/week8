package Ex1and2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String name, address;
        int age;

        PrintWriter pw = new PrintWriter(new FileWriter("src/Ex1and2/user.txt",true));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        name = scanner.nextLine();

        System.out.println("Input address: ");
        address = scanner.nextLine();

        System.out.println("Input ages: ");
        age = Integer.parseInt(scanner.nextLine());
//        age = (int) (scanner.nextLine());

        pw.println(name + "," +address +","+ age);
        pw.flush();
        pw.close();

        // (Integer) (/r)
        // Integer.parseInt()

    }
}