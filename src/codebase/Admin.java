package codebase;

import java.util.Scanner;

public class Admin extends User implements Menu {
    private App app; // Reference to the App instance
    private final String DEFAULT_USERNAME = "user101";
    private final String DEFAULT_PASSWORD = "pc123";
    User u2=new User();

    public Admin(App app) {
        super();
        this.app = app; // Initialize the App instance
        this.setUsername(DEFAULT_USERNAME);
        this.setPassword(DEFAULT_PASSWORD);
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    public void viewUserDetails(User user) {
        System.out.println("Username: " + user.getUsername());
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Age: " + user.getAge());
    }

    @Override
    public void adminMenu() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        System.out.println("1. See user details");
        System.out.println("2. Delete user");
        System.out.println("3. Delete content");
        System.out.println("\n\n");
        System.out.println("Enter your choice:");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                String name =u2.getName() ; // Example name
    int age = u2.getAge(); 
    String email = u2.getEmail(); // Example email
    String password = u2.getPassword();
                System.out.println("User details as follows:");
               User user = new User(name, age, email, password);
                viewUserDetails(user);
                System.out.println("Press 0 to go back");
                System.out.println("Press 1 to head to main menu");
                int input = scanner.nextInt();
                if (input == 0) {
                    adminMenu();
                } else if (input == 1) {
                    app.mainMenu();
                }
                break;

            case 2:
                System.out.println("Delete user");
                System.out.println("Press 0 to go back");
                System.out.println("Press 1 to head to the main menu");
                int input2 = scanner.nextInt();
                if (input2 == 0) {
                    adminMenu();
                } else if (input2 == 1) {
                    app.mainMenu();
                }
                break;

            case 3:
                System.out.println("Delete content");
                System.out.println("Press 0 to go back");
                System.out.println("Press 1 to head to main menu");
                int input3 = scanner.nextInt();
                if (input3 == 0) {
                    adminMenu();
                } else if (input3 == 1) {
                    app.mainMenu();
                }
                break;

            default:
                System.out.println("Enter valid options");
                adminMenu();
                break;
        }
    }
    @Override
    public void mainMenu(){
        
    }
}
