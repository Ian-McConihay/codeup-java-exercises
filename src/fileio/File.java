package fileio;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class File {
	public static void main(String[] args) throws IOException {
//		Directory path
		String directory = "./src/data";
		Path dataDirectory = Paths.get(directory);

// 		File path
		String filename = "groceryList.text";

//		Combine them
		Path dataFile = Paths.get(directory, filename);
		System.out.println(dataFile);

//		Creating the Directory
		if(Files.notExists(dataDirectory)){
			Files.createDirectory(dataDirectory);
		}
//		Creating the File
		if(Files.notExists(dataFile)){
			Files.createFile(dataFile);
		}

		Path groceriesTxtPath = Paths.get(directory, filename);
		List<String> groceryList = Arrays.asList("dog food", "fish food", "milk");
		System.out.println(groceryList);
		Files.write(groceriesTxtPath, groceryList);





	}
}






// relative path works because it starts from the current working directory
// absolute path works because it's a direct shot very unlikely to be affected