package utd.persistentDataStore.datastoreServer;

import java.io.IOException;

import utd.persistentDataStore.datastoreServer.commands.ServerCommand;
import utd.persistentDataStore.utils.FileUtil;
import utd.persistentDataStore.utils.ServerException;
import utd.persistentDataStore.utils.StreamUtil;

public class CommandWrite extends ServerCommand {

	@Override
	public void run() throws IOException, ServerException {
		String name = StreamUtil.readLine(inputStream);
		int length = Integer.parseInt(StreamUtil.readLine(inputStream));
		byte[] data = StreamUtil.readData(length, inputStream);
		FileUtil.writeData(name, data);
		StreamUtil.writeLine("OK", outputStream);
		// TODO Auto-generated method stub

	}

}
