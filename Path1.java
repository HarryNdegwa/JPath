import java.nio.file.Path;
import java.nio.file.Paths;


public class Path1{

    public static void main(String[] args){

        Path path = Paths.get(".");

        System.out.println("The current direcorty path is "+path.toAbsolutePath());

    }
}