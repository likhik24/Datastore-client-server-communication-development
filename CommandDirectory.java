package utd.persistentDataStore.datastoreServer;

//import java.awt.List;
import java.io.IOException;
import java.util.List;

import utd.persistentDataStore.datastoreServer.commands.ServerCommand;
import utd.persistentDataStore.utils.FileUtil;
import utd.persistentDataStore.utils.ServerException;
import utd.persistentDataStore.utils.StreamUtil;

public class CommandDirectory extends ServerCommand {

	@Override
	public void run() throws IOException, ServerException {
		// TODO Auto-generated method stub
		List<String> directory = FileUtil.directory();
		String length = String.valueOf((directory.size()));
		if(directory.size()!=0){
			StreamUtil.writeLine("OK", outputStream);
			StreamUtil.writeLine(length, outputStream);
			for(String name : directory){
				StreamUtil.writeLine(name, outputStream);
	}

}
	}}
