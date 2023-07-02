import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {


    public static void main(String[] args) {
         Path path = Paths.get("/Users/junseolee/Desktop/java.rtf");
         Stream<String> stream;
         stream = Files.lines(path, Charset.defaultCharset());
         stream.forEach();
        
    }
}
