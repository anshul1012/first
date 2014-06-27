import java.io.*;

public class ChatLog
{
	// filename
	public static string logfile = "log.txt";
	private BufferedReader logReader;
	private BufferedWriter logWriter;

	// default constructor
	public ChatLog()
	{
		logReader = new BufferedReader(new FileReader(logfile));
		logWriter = new BufferedWriter(new FileWriter(logfile, true));
	}

	// function to log chat text
	public void logChatText(String chatText)
	{
		try
		{
			logWriter.write(chatText);
		}
		catch (Exception e)
		{
			// to be added later
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
