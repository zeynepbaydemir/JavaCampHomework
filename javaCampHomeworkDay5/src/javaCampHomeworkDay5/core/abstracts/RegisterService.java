package javaCampHomeworkDay5.core.abstracts;

import javaCampHomeworkDay5.entities.concretes.User;

public interface RegisterService {

	User register(String email, String password);
}
