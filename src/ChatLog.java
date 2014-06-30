
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class ChatLog {
    
     // filename 
    public static String logfile = "C:\\Users\\anshul\\Documents\\NetBeansProjects\\ChatRoom\\src\\log.txt"; 
    private BufferedReader logReader; 
    private BufferedWriter logWriter;
    private File f;
    // default constructor 
    public ChatLog() throws FileNotFoundException, IOException 
    { 
        //f = new File("C:\\Users\\anshul\\Documents\\NetBeansProjects\\ChatRoom\\src\\log.txt");
        //f.setReadable(true);
        //f.setWritable(true);
        logReader = new BufferedReader(new FileReader(logfile)); 
        logWriter = new BufferedWriter(new FileWriter(logfile)); 
    } 
    // function to log chat text 
    public void logChatText(String chatText) 
    { 
        try 
        { 
            logWriter.write(chatText);
        }
    
        catch (Exception e) 
        { // to be added later 
        } 
    } 
    // function to retrieve chat log 
    public String retrieveChatLog() 
    { 
        String chatLog = ""; 
        try 
        { 
            String line = ""; 
            while((line = logReader.readLine()) != null) 
            { 
                chatLog += line + "\n"; 
            } 
        } 
        catch (Exception e) 
        { 
            throw new RuntimeException(e); 
        } 
        return chatLog; 
    }
}
