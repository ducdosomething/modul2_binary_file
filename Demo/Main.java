package Demo;

public class Main {
    public static void main(String[] args) {
        WriteFile writeFile = new WriteFile();
        writeFile.writeFile(new User("Duc", 24));
        writeFile.writeFile(new User("Huy", 27));
    }
}
