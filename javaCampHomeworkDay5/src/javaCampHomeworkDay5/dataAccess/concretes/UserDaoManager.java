package javaCampHomeworkDay5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import javaCampHomeworkDay5.dataAccess.abstracts.UserDao;
import javaCampHomeworkDay5.entities.concretes.User;

public class UserDaoManager implements UserDao{
	private List<User> userList;
	private int userId;
	
	public void InMemoryUserDao() {
		userList = new ArrayList<User>();
		userId = 0;
	}
	
	@Override
	public void add(User user) {
		user.setId(userId + 1);
		userList.add(user);
		userId++;
	}

	@Override
	public void update(User user) {
		int index = user.getId()-1;
		System.out.println(index);
		userList.set(index, new User(user.getName(), user.getLastName(), user.geteMail(), user.getPassword()));
		System.out.println(user.getName() + " has been updated.");
	}

	@Override
	public void delete(User user) {
		userList.remove(user.getId()-1);
		userId--;
		System.out.println(user.getName() + " has been deleted.");
	}

	@Override
	public User getById(int id) {
		User user = null;
		for (User item : userList) {
			if(item.getId() - 1 == id)
			{
				user = item;
			}
		}
		return user;
	}

	@Override
	public List<User> getall() {
		return userList;
	}

	@Override
	public User getByEmail(String email) {
		User user = null;
		for (User item : userList) {
			if(item.geteMail().equals(email))
			{
				user = item;
			}
		}
		return user;
	}
}
