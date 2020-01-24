import java.io.File;

public class FilePath {
    public static void main(String[] args) {
        File file = new File("README.md");
        String filepath = file.getAbsolutePath();
        System.out.println("파일경로 : " + filepath);

        boolean isFile = file.isFile();
        System.out.println("파일이 있습니까? " + isFile);
        System.out.println("경로 구분자는 무엇입니까? " + File.separator);
    }
}
