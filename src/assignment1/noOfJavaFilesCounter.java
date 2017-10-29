package assignment1;
 
import java.io.File;
import java.io.IOException;
public class noOfJavaFilesCounter {
    
  public static void main(String args[]){
      String filename = "newFile.txt";
      String workingDirectory = System.getProperty("user.dir");
      //****************//
      
      String absoluteFilePath = "";
      //absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
      absoluteFilePath = workingDirectory + File.separator + filename;
      System.out.println("Final filepath : " + absoluteFilePath);
      File directory=new File("C:\\Maven\\apache-maven-3.5.2");
      int fileCount=directory.list().length;
      System.out.println("File Count:"+fileCount);
      
      
  }
}