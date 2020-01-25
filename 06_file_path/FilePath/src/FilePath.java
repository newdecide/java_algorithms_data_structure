import java.io.File;

public class FilePath {
    public static void main(String[] args) {
        File file = new File("README.md");
        String filepath = file.getAbsolutePath();
        System.out.println("파일경로 : " + filepath);

        boolean isFile = file.isFile();
        System.out.println("파일이 있습니까? " + isFile);
        System.out.println("경로 구분자는 무엇입니까? " + File.separator);

        File directory = new File("../../../java_algorithms_data_structure/06_file_path/FilePath");
        boolean isDir = directory.isDirectory();
        System.out.println("폴더입니까? " + isDir);

        File nofile = new File("hello.java");
        System.out.println("파일이 있습니다. "+ file.exists());
        System.out.println("폴더가 있습니다. "+ directory.exists());
        System.out.println("hello.java파일이 있습니까? " + nofile.exists());
    }
}
