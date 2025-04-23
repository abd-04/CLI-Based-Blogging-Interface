package codebase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class userFile {
    private static final String FILE_NAME = "user_info.txt";

    // Method to create the file if it doesn't exist
    public void createFileIfNotExists() {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveUserInfo(User user) {
        createFileIfNotExists(); // Ensure the file is created before writing
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write("Name: " + user.getName() + "\n");
            writer.write("Age: " + user.getAge() + "\n");
            writer.write("Username: " + user.getUsername() + "\n");
            writer.write("Email: " + user.getEmail() + "\n");
            writer.write("-----------------------\n");
            System.out.println("User information saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
