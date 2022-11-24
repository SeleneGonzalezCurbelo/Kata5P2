package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Email;

public class EmailReader {
    public static List<Email> read(String fileName){
        List<Email> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while(true){
                String line = reader.readLine();
                if (line == null) break;
                if(new Email(line).isEmail()){
                    System.out.println("line: " + line);
                    list.add(new Email(line));
                }
            }
        }
        catch(FileNotFoundException exception){
            System.out.println("ERROR MailListReader::read (FileNotFoundException)" 
                    + exception.getMessage());
        }
        catch(IOException exception){
            System.out.println("ERROR MailListReader::read (IOException)" 
                    + exception.getMessage());
        }
        return list;
    }
}
