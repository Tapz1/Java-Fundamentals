package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\chris\\Documents\\Coding\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\byte_data";
        String writePath = "C:\\Users\\chris\\Documents\\Coding\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\exercise_new_file.txt";
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        FileOutputStream fout = null;

        int i;

        try{

            inputStream = new FileInputStream(filePath);
            bufferedInputStream = new BufferedInputStream(inputStream);
            fout = new FileOutputStream(writePath);

            // five bytes at a time
            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while((bytesRead = bufferedInputStream.read(buffer)) != -1){
                System.out.println(new String(buffer, 0, bytesRead));

            }


            do {
                i = bufferedInputStream.read();
                if (i != -1) {
                    fout.write(i);
                }
            }while (i != -1);


        } catch(IOException exception){
            exception.printStackTrace();
        } finally {

            try{
                inputStream.close();
                bufferedInputStream.close();
                fout.close();
            } catch(IOException exception){
                exception.printStackTrace();
            }
        }

    }
}