package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class XUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + "eklendi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + "güncellendi");
		
	}

	@Override
	public User getById(int id) {
		System.out.println(id + "ye sahip user getirildi");
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("kullanýlar getirildi");
		return null;
	}

	@Override
	public User getByEmail(String email) {
		
		return null;
	}

}
