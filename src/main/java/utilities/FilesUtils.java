package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FilesUtils {
     private FilesUtils(){
        super();
    }
     public static void deleteFiles(File dirPath){
         if (dirPath==null || !dirPath.exists()){
             LogsUtils.warn("Directory does not exist:" + dirPath);
             return;
         }
         File[] filesList = dirPath.listFiles();
         if (filesList==null){
             LogsUtils.warn("Failed to list files in:" +dirPath);
             return;
         }
         for (File file : filesList){
             if(file.isDirectory()){
                 deleteFiles(file);
             }else {
                 try {
                     Files.delete(file.toPath());
                 }catch (IOException e){
                     LogsUtils.error("Failed to delete file: " +file);
                 }
             }
         }
     }
}
