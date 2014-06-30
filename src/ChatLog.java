import java.io.*;

public class ChatLog
{
	// filename
	public static String logfile = "log.txt";
	private BufferedReader logReader;
	private BufferedWriter logWriter;

	// default constructor
	/*public ChatLog() throws FileNotFoundException, IOException
	{
		logReader = new BufferedReader(new FileReader(logfile));
		logWriter = new BufferedWriter(new FileWriter(logfile, true));
	}*/

	// function to log chat text
	public void logChatText(String chatText)
	{
	    logReader = new BufferedReader(new FileReader(logfile));
		try
		{
			logWriter.write(chatText);
		}
		catch (Exception e)
		{
			// to be added later
		}
		logReader.close();
	}

	// function to retrieve chat log
	public String retrieveChatLog()
	{
	    logWriter = new BufferedWriter(new FileWriter(logfile));
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
		logWriter.close();
		return chatLog;
	}
}