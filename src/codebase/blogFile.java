/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codebase;

/**
 *
 * @author abdullah
 */
import java.io.FileWriter;
import java.io.IOException;
public class blogFile {
    private final String FILE_NAME = "blog_info.txt";
    public void saveBlogInfo(Blog blog){
         try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write("Title: " + blog.getTitle() + "\n");
            writer.write("Content: " + blog.getContent() + "\n");
              writer.write("Date: " + blog.getDate() + "\n");
            writer.write("-----------------------\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

