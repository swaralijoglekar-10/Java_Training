package lecture21to30.fileFolder;

import java.io.File;
import java.io.IOException;

public class CreateFolderExample {

    public static void main(String[] args) throws IOException {

        //   MY CODE

        // create file- give path
        // if the directory does not exist- create the directory
        // create with mkdir or mkdirs(multiple folders)

        //1. Create folder
        File folder = new File("C:\\Users\\joglesar\\Swarali\\Self-study\\Full stack development\\Java\\Office Java Training\\Java office training coding project\\JavaTrainingOffice\\src\\lecture21to30\\swaraliFolder");
        if(!folder.exists()){
            boolean created = folder.mkdir();
            if(created) {
                System.out.println("Folder is created");
            }
            else{
                System.out.println("Folder cannot be created");
            }
        }
        else{
            System.out.println("Folder exists");
        }

        //2. Create file
        File file = new File("C:\\Users\\joglesar\\Swarali\\Self-study\\Full stack development\\Java\\Office Java Training\\Java office training coding project\\JavaTrainingOffice\\src\\lecture21to30\\swaraliFolder\\sample.txt");
        if(!file.exists()){
            boolean fileCreated = file.createNewFile();  //IOException
            if(fileCreated)
                System.out.println("File is created");
            else
                System.out.println("File cannot be created");
        }
        else{
            System.out.println("File exists");
        }

    }
}
