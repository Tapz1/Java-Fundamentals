package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02 {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\chris\\Documents\\Coding\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt";
        String writePath = "C:\\Users\\chris\\Documents\\Coding\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\exercise_2_new.txt";
        String str;


        try (BufferedReader buffIn = new BufferedReader(new FileReader(filePath)); BufferedWriter buffOut = new BufferedWriter(new FileWriter(writePath))) {
            int n;

            do{
                str = buffIn.readLine().replaceAll("a","-").replaceAll("e","~");
                buffOut.write(str);
                System.out.print(str);
            }while(buffIn.read() != -1);

/*
            while ((n = buffIn.read()) != -1) {

                buffOut.write(n);
                System.out.print((char) n);

            }
*/
        } catch (IOException exc) {
            System.out.println("Error occurred: " + exc.getMessage());
        }
    }
}