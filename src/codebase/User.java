package codebase;



/**
 *
 * @author abdullah
 */
import java.util.Scanner;
public class User {
    private String username;
    private String password;
    private String name;
    private String email;
    private int age;
         

   
    
    public User() {                         //default constructor
        this.username = "default_username";
        this.password = "default_password";
        this.name = "default_name";
        this.email = "default_email";
        this.age = 0; // Default age
        
    }

    public User(String username, int age, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.age = age;
        
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // no getter for the password to make it unaccessible to the admin even. Complete encapsulation
    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {   
        return age;
    }

    public String getPassword() {
        return password;
    }
    
    
    
    
    
}
