package javaCampHomeworkDay5.core.concretes;

import Google.GoogleManager;
import Google.UserGoogle;
import javaCampHomeworkDay5.core.abstracts.RegisterService;
import javaCampHomeworkDay5.entities.concretes.User;

public class GoogleManagerAdapter implements RegisterService {

	@Override
	public User register(String email, String password) {
		GoogleManager googleManager = new GoogleManager();
		UserGoogle userGoogle = googleManager.register(email, password);
		User user = new User(userGoogle.getFirstName(),
				userGoogle.getLastName(), userGoogle.getEmail(),
				userGoogle.getPassword());
		return user;
	}

}
