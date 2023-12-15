package com.rest.udemy.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static int usersCount=0;
	
	private static List<User> users = new ArrayList<>();
	
	static {
	users.add(new User(++usersCount,"Adam", LocalDate.now().minusYears(30)));
	users.add(new User(++usersCount,"JP", LocalDate.now().minusYears(44)));
	users.add(new User(++usersCount,"Mario", LocalDate.now().minusYears(48)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public  User findById(int id){
		Predicate<? super User> predicate = user-> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public  User insertUser(User user){
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	
	public  User deletetUser(int id){
		Predicate<? super User> predicate = user-> user.getId().equals(id);
		User elemento = users.stream().filter(predicate).findFirst().orElse(null);
		users.remove(elemento);
		return elemento;
	}
	
}
