package Google;

import java.util.ArrayList;
import java.util.List;

public class GoogleManager {

static List<UserGoogle> usersGoogle;
	
	public GoogleManager() {
		usersGoogle = new ArrayList<UserGoogle>();
		usersGoogle.add(new UserGoogle("test1", "test1", "test1@test1.com", "test123"));
		usersGoogle.add(new UserGoogle("test2", "test2", "test2@test2.com", "test1223"));
		usersGoogle.add(new UserGoogle("test3", "test3", "test3@test2.com", "test1432"));
		usersGoogle.add(new UserGoogle("test4", "test4", "test4@test2.com", "test1335"));
	}
	
	public UserGoogle register(String email, String password) {
		UserGoogle user = null;
		for (UserGoogle item : usersGoogle) {
			if(item.getEmail().equals(email) && item.getPassword().equals(password)) {
				user = item;
				break;
			}
		}
		return user;
	}
}
