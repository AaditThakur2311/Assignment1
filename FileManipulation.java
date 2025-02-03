package homeworkday2;
import java.io.*;

public class FileManipulation {
  

	    public static void main(String[] args) {
	        String filePath = "input.txt"; 

	        int lineCount = 0, wordCount = 0, charCount = 0;
	        boolean inMultiLineComment = false;

	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;

	            while ((line = reader.readLine()) != null) {
	                line = line.trim(); 

	               
	                if (line.startsWith("/*")) {
	                    inMultiLineComment = true;
	                }
	                if (inMultiLineComment) {
	                    if (line.endsWith("*/")) {
	                        inMultiLineComment = false;
	                    }
	                    continue; 
	                }

	                
	                if (line.contains("//")) {
	                    line = line.split("//")[0].trim(); 
	                }

	                
	                if (line.isEmpty()) {
	                    continue;
	                }

	                
	                lineCount++;

	               
	                charCount += line.length();

	                
	                wordCount += line.split("\\s+").length;
	            }

	           
	            System.out.println("Total lines (excluding comments): " + lineCount);
	            System.out.println("Total words: " + wordCount);
	            System.out.println("Total characters: " + charCount);

	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }
	}


