package codebase;

import java.util.Date;
import java.util.Scanner;

public class Blog {
    private String title;
    private String content;
    private Date date;
     Scanner s1 = new Scanner(System.in);

    public Blog() {
        
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

    public void createBlog() {
        System.out.println("Enter title: ");
        title = s1.nextLine();
        
        System.out.println("Start writing your blog content: ");
        content = s1.nextLine();
        
        date = new Date();
        System.out.println("Blog created successfully on " + date);
    }
}
