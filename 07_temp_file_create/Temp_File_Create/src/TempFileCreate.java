import java.io.File;
import java.io.IOException;

public class TempFileCreate {
    public static void main(String[] args) {
        try {
            File file_create1 = File.createTempFile("text1_", ".txt", new File("../../../java_algorithms_data_structure/07_temp_file_create/"));
            System.out.println(file_create1.getAbsolutePath());

//            file_create1.deleteOnExit();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
