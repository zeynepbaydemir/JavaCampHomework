package javaCampHomeworkDay5.business.concretes;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampHomeworkDay5.business.abstracts.UserService;
import javaCampHomeworkDay5.dataAccess.abstracts.UserDao;
import javaCampHomeworkDay5.entities.concretes.User;

public class UserManager implements UserService{

private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public boolean add(User user) {	
		
		boolean result = false;
		
		if(CheckIfEmailValid(user.geteMail()) && CheckIfEmailExists(user.geteMail())){
			 if(CheckIfPasswordValid(user.getPassword())){
				 if(CheckIfNameLengthValid(user.getName(), user.getLastName())) {
					 this.userDao.add(user);
					 result = true;
					 return result;
				 }else {
					 System.out.println("Your name and surname must be min two letters.");
				 }
				 
			} else {
				System.out.println("Password is only 6 characters long.");
			}
			
		} else {
			result = false;
			System.out.println("invalid email address");
		}		
		return result;
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public User getById(int id) {
		return this.userDao.getById(id);
	}

	@Override
	public List<User> getall() {
		return this.userDao.getall();
	}

	@Override
	public User getByEmail(String email) {
		return this.userDao.getByEmail(email);
	}

	public boolean CheckIfPasswordValid(String password){
		boolean result = false;
		
		if(password.length() >= 6){
			result = true;
		}
	
		return result;
	}

	public boolean CheckIfEmailValid(String email) {
		boolean result = false;
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			result = true;
		}
		return result;
	}
	
	public boolean CheckIfEmailExists(String email) {
		boolean result = false;
		if(this.userDao.getByEmail(email) == null) {
			result = true;
		}
		return result;
	}
	
	public boolean CheckIfNameLengthValid(String firstName, String lastName) {
		boolean result = false;
		if(firstName.length() >=2 && lastName.length() >= 2){
			result = true;
		}
		return result;
	}
}
