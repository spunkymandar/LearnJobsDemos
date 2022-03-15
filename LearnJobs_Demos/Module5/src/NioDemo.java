import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		processFile();
	}

	private static void processFile() throws IOException {
		// TODO Auto-generated method stub
		Path dir=Files.createTempDirectory("my-dir");
		//Path file=Paths.get("sample.txt");
		Path fileCreation=dir.resolve("sample.txt");
		Path newfilePath=Files.createFile(fileCreation);
		System.out.println("File is created");
		System.out.println(Files.exists(newfilePath));
	
		Path sourcePath=Paths.get("d:\\first.txt");
		Path destinationPath=Paths.get("d:\\second.txt");
		
		Files.copy(sourcePath, destinationPath);
		
		Files.move(sourcePath, destinationPath);
	}
	

}
