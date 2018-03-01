package dz_9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static String read(String path) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));

            StringBuilder stringBuilder = new StringBuilder();

            String currentString;
            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        }
        catch(FileNotFoundException e){
            System.out.println("Error");

        } catch (IOException e) {
            System.out.println("Error 2");
        }

        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error finally");
            }
        }
        return " ";
    }

    public static void main(String[] args) {
        System.out.println(read("D:\\Java course\\Main_School.tt"));
    }
}
