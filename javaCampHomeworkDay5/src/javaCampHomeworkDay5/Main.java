package javaCampHomeworkDay5;

import java.util.Scanner;


import javaCampHomeworkDay5.business.abstracts.AuthService;
import javaCampHomeworkDay5.business.concretes.AuthManager;
import javaCampHomeworkDay5.business.concretes.UserManager;
import javaCampHomeworkDay5.core.concretes.GoogleManagerAdapter;
import javaCampHomeworkDay5.core.concretes.VerificationLink;
import javaCampHomeworkDay5.dataAccess.concretes.UserDaoManager;

public class Main {
	private static boolean flag = true;
	private static Scanner in = new Scanner(System.in);
	static AuthService authService = new AuthManager( new UserManager(new UserDaoManager()), new GoogleManagerAdapter(), new VerificationLink());
	
	public static void main(String[] args) {
		
		dashboard();
		
	}
	
	public static void dashboard() {
		
		while (flag)
        {
            System.out.println("\n*************** Main Menu ***************");
            System.out.println("          1. User Register");
            System.out.println("          2. User Register With Google");
            System.out.println("          3. User Login");
            System.out.println("          4. Exit \n");
            
            int key = in.nextInt();
            switch (key)
            {
                case 1:
                    Register();
                    break;
                case 2:
                    RegisterGoogleAccount();
                    break;
                case 3:
                    Login();
                    break;
                case 4:
                	System.out.println("-------------- See you later! ---------------");
                    flag = false;
                    break;
                default:
                	System.out.println("\nPlease try again.");
                    break;
            }
        }
		
	}
	
	private static void Register() {
		
		System.out.println("Name: ");
		String firstName = in.next();
		
		System.out.println("Last Name: ");
		String lastName = in.next();
		
		System.out.println("Email Address: ");
		String email = in.next();
		
		System.out.println("Password: ");
		String password = in.next();
		
		authService.register(firstName, lastName, email, password);
		
	}
	
	private static void RegisterGoogleAccount() {
		
		System.out.println("Email: ");
		String email = in.next().toString();
		
		System.out.println("Password: ");
		String password = in.next().toString();
		
		authService.registerGoogle(email, password);
	}
	
	private static void Login() {
		
		System.out.println("Email Address: ");
		String email = in.next();
		
		System.out.println("Password: ");
		String password = in.next();
		
		authService.login(email, password);
	}


}
