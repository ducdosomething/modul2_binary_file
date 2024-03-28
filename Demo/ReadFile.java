package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<User> readUsers() {
        List<User> users = new ArrayList<>();
        File file = new File("Demo/example.dat");
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            while (true) {
                try {
                    Object object = objectInputStream.readObject();
                    if (object instanceof User) {
                        users.add((User) object);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    // Đã đọc hết dữ liệu từ tệp tin
                    break;
                }
            }
            objectInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public static void main(String[] args) {
        List<User> users = readUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
