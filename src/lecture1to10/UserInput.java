package lecture1to10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. next(), netLine(), nextInt()
        String str1 = sc.next();
        int i1 = sc.nextInt();

        //2. hasNext()
        String str2 = "India is my country";
        sc = new Scanner(str2);
        while (sc.hasNext()){
            System.out.print(sc.next()+" ");
        }
        System.out.println();
        sc.close();

        //3. hasNextLine()
        try {
            File file = new File("src/Lecture1to10/info.txt");
            Scanner sc_new = new Scanner(file); // Unhandled exception: java.io.FileNotFoundException
            while(sc_new.hasNextLine()){
                String line = sc_new.nextLine();
                System.out.println(line);
            }
            sc_new.close();
        }
        catch(FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }

    }
}
