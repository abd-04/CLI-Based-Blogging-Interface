package codebase;

import java.util.Scanner;

public class App implements Menu{
    public static void main(String[] args) {
       App app = new App();
        app.mainMenu();
        
    }
        
        
    @Override
         public void mainMenu() {
        Scanner s1=new Scanner(System.in);
        Admin a1=new Admin(this);       //admin obj a1
        User u1=new User();
      //  Menu menu=new Menu();
        Blog blog=new Blog();
        Boolean logIn=false;
        userFile uFile=new userFile();
        blogFile bFile=new blogFile();
        
        
       
        

        while (!logIn) {              // !logIn means the opposite of logIn(logIn is set as false) i.e NOT of logIn
                                      // will be True. So loop runs till the condition is flagged as True.
            System.out.println("**** Welcome ****");
            System.out.println("1) Create Account");
            System.out.println("2) Sign in (as administrator)");
            System.out.println("3) Exit ");
            int choice = s1.nextInt();
            switch (choice) {
                case 2:
                    System.out.println("Enter username:");
                    String usernameAdmin = s1.next();
                    System.out.println("Enter password:");
                    String passAdmin = s1.next();
                    if (usernameAdmin.equals(a1.getUsername()) && passAdmin.equals(a1.getPassword())) {
                        // a1.getUsername__ a1 is the object followed by ( . ) then the method name to be used.
                        // removed the static
                        System.out.println("Welcome admin");
                        a1.adminMenu();
                        logIn = true;  // correct admin credentials. LogIn set as true(loop terminates)
                    } else {
                        System.out.println("Wrong credentials.");
                    }
                    break;

                case 3:
                    System.exit(0);

                case 1:
                  User user = new User();
                  App app=new App();
                    System.out.println("Enter your name:");
                    user.setName(s1.next());
                    System.out.println("Enter age:");
                    user.setAge(s1.nextInt());
                    System.out.println("Enter username:");
                    user.setUsername(s1.next());
                    System.out.println("Enter password:");
                    user.setPassword(s1.next());
                    System.out.println("Enter email:");
                    user.setEmail(s1.next());
                    uFile.saveUserInfo(user);
                    System.out.println("hey there ! " + user.getUsername());
                    System.out.println("\n\t\tStart writing einstein! ");
                    blog.createBlog();
                    bFile.saveBlogInfo(blog);
                    System.out.println("press 2 to head to main menu");
                    int p=s1.nextInt();
                    if(p==2){
                        app.mainMenu();
                    }
                    

                    logIn = true; // password and username set for the user(logIn set as true) terminates the loop
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        s1.close();
    }
    @Override
         public void adminMenu(){
         }
         }
