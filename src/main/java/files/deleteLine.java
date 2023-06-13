package files;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class deleteLine {
	public static void delLine(String fileInpath,String fileOutpath) throws IOException {
    // create two objects for input and output files
	File inputFile = new File(fileInpath);
	File outputFile = new File(fileOutpath);
	// create two objects for input and output buffering
	BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
    int idx = 1;
    String currentLine;
    while ((currentLine = reader.readLine()) != null){
    	if(idx != 1){
    	     writer.write(currentLine + "\n");
    	}
    	idx = idx +1;
    }
    writer.close();
    reader.close();
	}

}