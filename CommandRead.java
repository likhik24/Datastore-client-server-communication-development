package utd.persistentDataStore.datastoreServer;

import java.io.IOException;

import utd.persistentDataStore.datastoreServer.commands.ServerCommand;
import utd.persistentDataStore.utils.FileUtil;
import utd.persistentDataStore.utils.ServerException;
import utd.persistentDataStore.utils.StreamUtil;

public class CommandRead extends ServerCommand {

	//private int length;

	@Override
	public void run() throws IOException, ServerException {
		String name=StreamUtil.readLine(inputStream);
		byte[] data=FileUtil.readData(name);
		if(data!=null)
		{
			int length = data.length;
		StreamUtil.writeLine("OK\n", outputStream);
		StreamUtil.writeLine(String.valueOf(length), outputStream);
		StreamUtil.writeData(data, outputStream);
		}
		else
		{
			StreamUtil.sendError("file not found",outputStream);
		}
		// TODO Auto-generated method stub

	}

}
