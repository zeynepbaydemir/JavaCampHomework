package javaCampHomeworkDay5.business.concretes;

import javaCampHomeworkDay5.business.abstracts.AuthService;
import javaCampHomeworkDay5.business.abstracts.UserService;
import javaCampHomeworkDay5.core.abstracts.RegisterService;
import javaCampHomeworkDay5.core.abstracts.VerificationService;
import javaCampHomeworkDay5.core.concretes.GoogleManagerAdapter;
import javaCampHomeworkDay5.core.concretes.VerificationLink;
import javaCampHomeworkDay5.entities.concretes.User;

public class AuthManager implements AuthService {
	private UserService userService;
	private RegisterService registerService;
	private VerificationService verificationService;
	
	public AuthManager(UserService userService, RegisterService registerService, VerificationService verificationService) {
		this.userService = userService;
		this.registerService = registerService;
		this.verificationService = verificationService;
	}
	
	public AuthManager(UserManager userService2, GoogleManagerAdapter registerService2,
			VerificationLink verificationLink) {
		
	}

	@Override
	public void register(String firstName, String lastName, String email, String password) {
		if(this.userService.add(new User(firstName, lastName, email, password))) {
			System.out.println("Register successful! Please verify your email.");
			this.verificationService.send();
		}else {
			System.out.println("Register Failed");
		}
	}
	
	@Override
	public void registerGoogle(String email, String password) {
		if(this.registerService.register(email, password) != null) {
			this.userService.add(this.registerService.register(email, password));
			System.out.println("Success!");
		}else {
			System.out.println("There are no such users registered with Google.");
		}
	}	

	@Override
	public void login(String email, String password) {
		if(this.userService.getByEmail(email) != null) {
			if(this.userService.getByEmail(email).geteMail().equals(email) && this.userService.getByEmail(email).getPassword().equals(password)) {
				System.out.println("Login successful");
			}else {
				System.out.println("No Such User Here Email Error");
			}
		}else {
			System.out.println("User not registered.");
		}
	}

	@Override
	public void logOut() {
		System.out.println("Successful Exit");
	}

}
