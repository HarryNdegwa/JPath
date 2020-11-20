import java.nio.file.Path;
import java.nio.file.Paths;


public class Path1{

    public static void main(String[] args){

        Path path = Paths.get("\\test.txt");

        System.out.println("The current direcorty path is "+path.toAbsolutePath());

        System.out.println("File name "+path.getFileName());

        System.out.println("Path components count "+path.toAbsolutePath().getNameCount());

    }
}