import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {


    public static void main(String[] args) throws IOException {
         Path path = Paths.get("/Users/junseolee/Desktop/java.rtf"); //파일의 경로 정보를 가고 있는 Path 객체 생성 
         Stream<String> stream;
         stream = Files.lines(path, Charset.defaultCharset());
         stream.forEach(System.out :: println);

         System.out.println();


         File file = path.toFile();
         FileReader fileReader = new FileReader(file);
         BufferedReader br = new BufferedReader(fileReader); //내부적으로 데이터를 버퍼에 저장하여 읽는 성능을 향상 시킴 
         stream = br.lines();
         stream.forEach(System.out :: println);

         
    }
}
