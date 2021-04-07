package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

public class Exercise_03 {

    public static void main(String[] args) throws IOException {
        //byteStreaming();
        characterStreaming();
    }

    public static void characterStreaming() throws IOException{
        String charFilePath = "C:\\Users\\chris\\Documents\\Coding\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data_2.txt";
        String newCharPath = "C:\\Users\\chris\\Documents\\Coding\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\newCharPath.txt";
        String fileString;

        try(BufferedReader charIn = new BufferedReader(new FileReader(charFilePath));
            BufferedWriter charOut = new BufferedWriter(new FileWriter(newCharPath))){
            int n;
            fileString = charIn.readLine();
            while(fileString != null){
                charOut.write(fileString);
                charOut.newLine();
                System.out.println(fileString);
                fileString = charIn.readLine();

            }
        }catch(IOException exc){
            System.out.println("exception caught");
        }
    }

    public static void byteStreaming(){
        String fileBytePath = "C:\\Users\\chris\\Documents\\Coding\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\byte_data";
        String newBytePath = "C:\\Users\\chris\\Documents\\Coding\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\newByteFile.txt";

        int i;
        try(BufferedInputStream byteIn = new BufferedInputStream(new FileInputStream(fileBytePath));
            BufferedOutputStream byteOut = new BufferedOutputStream(new FileOutputStream(newBytePath))){

            byte[] buffer = new byte[5];
            int bytesRead = 0;
            while((bytesRead = byteIn.read(buffer)) != -1){
                System.out.println(new String(buffer, 0, bytesRead));

            }
            do {
                i = byteIn.read();
                if (i != -1) {
                    byteOut.write(i);
                }
            }while (i != -1);

        }catch(IOException exc){
            System.out.println("IOException");
        }
    }
}