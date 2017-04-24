package utd.persistentDataStore.datastoreServer;

import java.io.IOException;

import utd.persistentDataStore.datastoreServer.commands.ServerCommand;
import utd.persistentDataStore.utils.FileUtil;
import utd.persistentDataStore.utils.ServerException;
import utd.persistentDataStore.utils.StreamUtil;

public class CommandDelete extends ServerCommand {

	@Override
	public void run() throws IOException, ServerException {
		// TODO Auto-generated method stub
		String name = StreamUtil.readLine(inputStream);
		//int length = Integer.parseInt(StreamUtil.readLine(inputStream));
		boolean data =FileUtil.deleteData(name);
		if(data!=false)
		{
		StreamUtil.writeLine("OK", outputStream);
		}
		else
		{
			StreamUtil.sendError("file not found",outputStream);
		}
		
	}

}
